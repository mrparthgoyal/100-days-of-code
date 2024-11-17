//day12
// power of two
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && (n & (n-1))==0);
    }
}

// find minimum in rotated sorted array
class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right])left=mid+1;
            else right=mid;
        }
        return nums[left];
    }
}

