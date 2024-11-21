//day16
// reverse a string
class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}

// majority element 2
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int n1=0,n2=0,count1=0,count2=0;
        for(int num:nums)
        {
            if(num==n1)count1++;
            else if(num==n2)count2++;
            else if(count1==0)
            {
                n1=num;
                count1=1;
            }
            else if(count2==0)
            {
                n2=num;
                count2=1;
            }
            else 
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(n1==num)count1++;
            else if(n2==num)count2++;
        }
        List<Integer>list=new ArrayList<>();
        if(count1>(n/3))list.add(n1);
        if(count2>(n/3))list.add(n2);
        return list;
    }
}