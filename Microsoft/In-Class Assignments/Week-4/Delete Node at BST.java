class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        //base case
        if (root == null)
            return null;
        //deletion if root is found
        if (root.val == key) {
            //if no children branch
            if (root.left == null && root.right == null)
                root = null;
            //only right branch
            else if (root.left == null)
                root = root.right;
            //only left branch
            else if (root.right == null)
                root = root.left;
            //both left and right children exist
            else if (root.left != null && root.right != null) {
                TreeNode tmp = root.left;
                while (tmp.right != null)
                    tmp = tmp.right;
                tmp.right = root.right;
                root = root.left;
            }
        }
        else if (root.val < key)
            root.right = deleteNode(root.right, key);
        else
            root.left = deleteNode(root.left, key);
        return root;
    }
}
