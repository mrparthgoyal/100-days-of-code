// inorder traversal of binary tree
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        return helper(root,list);
    }
    List<Integer>helper(TreeNode root,List<Integer>list)
    {
        if(root==null)return list;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
        return list;
    }
}

// level order traversal of binary tree
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>currentLevel=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.peek();
                q.remove();
                currentLevel.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            ans.add(currentLevel);
        }
        return ans;
    }
}