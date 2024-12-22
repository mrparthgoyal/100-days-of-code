// day47
// count complete tree nodes
class Solution {
    public int countNodes(TreeNode root) {
        int count=0;
        if(root==null)return 0;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            count++;
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
        }
        return count;
    }
}

// binary tree paths
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list=new ArrayList<>();
        if(root==null)return list;
        helper(root,"",list);
        return list;
    }
    static void helper(TreeNode root,String path,List<String>list)
    {
        if(root==null)return ;
        path=path+root.val;
        if(root.left==null && root.right==null)// check if leaf node
        {
            list.add(path);
        }
        else // not a leaf
        {
            path=path+"->";
            helper(root.left,path,list);
            helper(root.right,path,list);
        }
    }
}