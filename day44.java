// day44
// binary tree right side view
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>right=new ArrayList<>();
        if(root==null)return right;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.peek();
                q.remove();
                if(i==size-1)right.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return right;
    }
}

// sum of left leaves
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)return sum;
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum+=root.left.val;
        }
        sum+=sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
        return sum;
    }
}