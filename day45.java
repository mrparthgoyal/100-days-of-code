// day45
// binary tree preorder traversal
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer>list=new ArrayList<>();
    helper(root,list);
    return list;
}
static void helper(TreeNode root,List<Integer>list)
{
    if(root==null)return ;
    list.add(root.val);
    helper(root.left,list);
    helper(root.right,list);
}

// binary tree postorder traversal
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer>list=new ArrayList<>();
    helper(root,list);
    return list;
}
static void helper(TreeNode root,List<Integer>list)
{
    if(root==null)return ;
    helper(root.left,list);
    helper(root.right,list);
    list.add(root.val);
}