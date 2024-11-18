// day13
// Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxPro=0;
        for(int i=0;i<prices.length;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maxPro=Math.max(maxPro,prices[i]-minPrice);
        }
        return maxPro;
    }
}

// valid perfect square
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<1)return false;
        long left=1,right=num;
        while(left<=right)
        {
            long mid=left+(right-left)/2;
            long square=mid*mid;
            if(square==num)return true;
            else if(square<num)left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}