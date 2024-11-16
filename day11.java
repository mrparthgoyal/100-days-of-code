//day11
// merge sorted array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]res=new int[m+n];
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
            }
            else 
            {
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }
    }
}

// sqrt(x)
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}