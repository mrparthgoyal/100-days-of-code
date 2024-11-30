// count bits
class Solution {
    static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            count+=(n&1);
            n=n>>1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=count(i);
        }
        return ans;
    }
}

// H-Index
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++)
        {
            int h=n-i;
            if(citations[i]>=h)
            {
                return h;
            }
        }
        return 0;
    }
}