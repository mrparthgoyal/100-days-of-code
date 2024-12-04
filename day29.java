//day29
// adding spaces to a string
class Solution {
    public String addSpaces(String s, int[] spaces) {
        if(spaces.length==0)return s;
        StringBuilder sb=new StringBuilder();
        int start=0;
        for(int spaceIndex:spaces)
        {
            sb.append(s.substring(start,spaceIndex)).append(" ");
            start=spaceIndex;
        }
        sb.append(s.substring(start));
        return sb.toString();
    }
}

// 3 sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            // skip the duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int target=-nums[i]; // we want 2 numbers which have a sum equal to -nums[i] so that they can cancel out and the triplet sum becomes 0
            int left=i+1,right=n-1;
            while(left<right)
            {
                int sum=nums[left]+nums[right];
                if(sum==target)
                {
                    // add triplet to the result
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    // move both the pointers and skip the duplicates
                    while(left<right && nums[left]==nums[left+1])left++;
                    while(left<right && nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                }
                
                else if(sum<target) // move left pointer to increase the sum
                {
                    left++;
                }
                else if(sum>target) // move right pointer to decrease the sum
                {
                    right--;
                }
            }
        }
        return ans;
        
    }
}