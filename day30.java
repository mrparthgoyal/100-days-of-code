// longest substring without repeating characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        Map<Character,Integer>charIndexMap=new HashMap<>();
        int left=0;
        for(int right=0;right<n;right++)
        {
            char currentChar=s.charAt(right);
            if(charIndexMap.containsKey(currentChar))
            {
                left=Math.max(left,charIndexMap.get(currentChar)+1);
            }
            charIndexMap.put(currentChar,right);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}

// merge intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals==null || intervals.length==0)return new int[0][];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>merged=new ArrayList<>();
        int[]currentInterval=intervals[0];
        merged.add(currentInterval);
        for(int[]interval:intervals)
        {
            int currentEnd=currentInterval[1];
            int nextStart=interval[0];
            int nextEnd=interval[1];

            // check for interval
            if(nextStart<=currentEnd)
            {
                currentInterval[1]=Math.max(nextEnd,currentEnd); // merge the intervals
            }
            else
            {
                currentInterval=interval; // no overlap move to next interval
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}