// longest common subsequence
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                dp[i][j]=-1;
            }
        }
        return helper(text1,text2,n,m,dp);
    }
    static int helper(String text1,String text2,int n,int m,int[][]dp)
    {
        if(n==0 || m==0)return 0;
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        if(text1.charAt(n-1)==text2.charAt(m-1))
        {
            dp[n][m]= 1+helper(text1,text2,n-1,m-1,dp);
        }
        else
        {
            dp[n][m]= Math.max(helper(text1,text2,n-1,m,dp),helper(text1,text2,n,m-1,dp));
        }
        return dp[n][m];
    }
}

// next greater element 1
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //create a map to store the next greater element for each element in nums2
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        
        //traverse nums2 from right to left to fin the next greater element
        for(int i=nums2.length-1;i>=0;i--)
        {
            int num=nums2[i];
            while(!st.isEmpty() && st.peek()<=num)
            {
                st.pop();
            }
            // if stack is empty no greater element exists
            map.put(num,st.isEmpty()? -1:st.peek());
            st.push(num);
        }

        int[]result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
}