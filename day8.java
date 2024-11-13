//day8
// set matrix zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[]zeroR=new boolean[n];
        boolean[]zeroC=new boolean[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    zeroR[i]=true;
                    zeroC[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(zeroR[i] || zeroC[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}

// maximum XOR for each query
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int maxK=(1<<maximumBit)-1; //(2^maximumBit)-1
        int xor=0;
        for(int num:nums)
        {
            xor^=num;
        }
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=xor^maxK;
            xor^=nums[n-i-1];
        }
        return arr;
    }
}