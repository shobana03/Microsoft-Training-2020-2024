class Solution {
    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return res;
        }
        dfs(root,targetSum,new LinkedList<>());
        return res;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer>path){
        targetSum-=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && targetSum==0){
            res.add(new LinkedList<>(path));
        }
        else{
            if(root.left!=null){
                dfs(root.left,targetSum,path);
            }
            if(root.right!=null){
                dfs(root.right,targetSum,path);
            }
        }
        path.remove(path.size()-1);
    }
}
