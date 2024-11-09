// day 4
// Maximum subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);

            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }
}

// First missing positive
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int ele=nums[i];
            if(ele<=n && ele>=1)
            {
                int pos=ele-1;
                if(nums[pos]!=ele)
                {
                    int temp=nums[i];
                    nums[i]=nums[pos];
                    nums[pos]=temp;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
            }
        }
        return n+1;
    }
}