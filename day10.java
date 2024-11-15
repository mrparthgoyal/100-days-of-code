// day10
//single number 2
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            int key=entry.getKey();
            int freq=entry.getValue();
            if(freq==1)return key;
        }
        return -1;
    }
}

// happy number
class Solution {
    static int sumOfSquares(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int dig=n%10;
            sum+=dig*dig;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        ArrayList<Integer>seen=new ArrayList<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n=sumOfSquares(n);
        }
        if(n==1)return true;
        return false;
    }
}