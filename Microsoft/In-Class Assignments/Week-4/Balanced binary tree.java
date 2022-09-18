class Solution {
public boolean isBalanced(TreeNode root) {
int ans = height(root);
if(ans != -1)
return true;

 return false;
}

private int height(TreeNode root)
{
if( root == null)
return 0;
int hl = height(root.left);
int hr = height(root.right);
if(hl == -1 || hr == -1 || Math.abs(hl-hr)>1) return -1;
return 1+ Math.max(hl,hr);
}
}
