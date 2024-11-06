// Two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[]ans=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}

//  Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]!=nums[j])
            {
                int temp=nums[j];
                nums[j]=nums[i+1];
                nums[i+1]=temp;
                i++;
            }
        }        
        return i+1;
    }
}