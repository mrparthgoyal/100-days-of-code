//day14
// majority element
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                ele=nums[i];
                count++;
            }
            else if(ele==nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(ele==nums[i])
            {
                count1++;
            }
        }
        int ans=0;
        if(count1>=(n/2))
        {
            ans=ele;
        }
        return ans;
    }
}

// rotate array
class Solution {
    public void reverse(int[]arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
    }
}
