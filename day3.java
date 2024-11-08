// day3
// Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[]result=new int[n+1];
        result[0]=1;
        return result;
    }
}

// Find First and Last Position of Element in Sorted Array
class Solution {
    static int firstOcc(int[]nums,int target)
    {
        int first=-1;
        int s=0;
        int n=nums.length;
        int e=n-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                first=mid;
                e=mid-1;
            }
            else if(nums[mid]<target)s=mid+1;
            else e=mid-1;
        }
        return first;
    }
    static int lastOcc(int[]nums,int target)
    {
        int last=-1;
        int s=0;
        int n=nums.length;
        int e=n-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            {
                last=mid;
                s=mid+1;
            }
            else if(nums[mid]<target)s=mid+1;
            else e=mid-1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=firstOcc(nums,target);
        int last=lastOcc(nums,target);
        return new int[]{first,last};
    }
}