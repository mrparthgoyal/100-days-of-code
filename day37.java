// day37
// maximum depth of a binary tree
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int h1=maxDepth(root.left);
        int h2=maxDepth(root.right);
        int ans=Math.max(h1,h2)+1;
        return ans;
    }
}

// same tree
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
        {
            return p==q;
        }
        boolean leftChild=isSameTree(p.left,q.left);
        boolean rightChild=isSameTree(p.right,q.right);
        boolean rootNode=(p.val==q.val);
        if(leftChild && rightChild && rootNode)
        {
            return true;
        }
        return false;
    }
}