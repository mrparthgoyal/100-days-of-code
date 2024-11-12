// day7
// Summary ranges
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String >ans=new ArrayList<>();
        if(nums==null || nums.length==0)return ans;
        int start=nums[0];
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) ans.add(String.valueOf(start));
                else ans.add(start + "->" + nums[i - 1]);
                if (i < nums.length) start = nums[i];
            }
        }
        return ans;
    }
}

//Unique Number of Occurrences
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int num:arr)
     {
        map.put(num,map.getOrDefault(num,0)+1);
     }   
     HashSet<Integer>set=new HashSet<>(map.values());
     return set.size()==map.size();
    }
}
