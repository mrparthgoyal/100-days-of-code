//day46
// binary tree level order traversal 2
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer>currentLevel=new ArrayList<>(); // store the current level in this list
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();
                currentLevel.add(node.val);
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            list.add(0,currentLevel); // store the current level in reverse manner in the list
        }
        return list;
    }
}

// minimum depth of binary tree
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int h1=minDepth(root.left); // height of left subtree
        int h2=minDepth(root.right); // height of right subtree
        if(root.left==null)return h2+1; // if left child null hai to right se depth hoyegi 
        if(root.right==null)return h1+1; // if right child null hai to left se depth hoyegi
        return Math.min(h1,h2)+1; // return the one with minimum depth
    }
}