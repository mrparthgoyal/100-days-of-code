// day 5
// Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
// Convert Sorted Array to Binary Search Tree
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }
    static TreeNode buildBST(int[]nums,int left,int right)
    {
        if(left>right)return null;
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=buildBST(nums,left,mid-1);
        node.right=buildBST(nums,mid+1,right);
        return node; 
    }
}