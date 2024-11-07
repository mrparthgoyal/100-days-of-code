// Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

// Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)
            {
                s=mid+1;
            }
            else if(nums[mid]>target)
            {
                e=mid-1;
            }
        }
        return s;
    }
}