// day27
// two sum 2 : sorted array
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int left=0;
        int right=numbers.length-1;
        int[]ans=new int[2];
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];
            if(sum==target)
            {
                // 1-based indexing
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }
            else if(sum<target)left++;
            else if(sum>target)right--;
        }
        return ans;
    }
}

// length of the last word 
class Solution {
    public int lengthOfLastWord(String s) {
        String[]words=s.split("\\s+");
        return words[words.length-1].length();
    }
}
