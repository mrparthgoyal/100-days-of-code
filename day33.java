//day33
// longest palindromic substring
class Solution {
    static Boolean[][]dp;
    static boolean isPalindrome(String s,int i,int j)
    {
        // base case
        if(i>=j)return true; // single character or empty substring
        if(dp[i][j]!=null)return dp[i][j]; // return the precomputed result if available

        // recursive check for palindrome
        if(s.charAt(i)==s.charAt(j))
        {
            dp[i][j]=isPalindrome(s,i+1,j-1); // check inner substring
        }
        else
        {
            dp[i][j]=false;
        }
        return dp[i][j];
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        dp=new Boolean[n][n];
        String result=""; // to store the longest palindrome
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(isPalindrome(s,i,j))
                {
                    // update result if a longer palindrome is found
                    if(j-i+1>result.length())
                    {
                        result=s.substring(i,j+1);
                    }

                }
            }
        }  
        return result;      
    }
}

// product of array elements except self
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        int prefix=1;
        int postfix=1;
        for(int i=0;i<n;i++)
        {
            ans[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*postfix;
            postfix=postfix*nums[i];
        }
        return ans;
    }
}