// day24
// Find the Difference of Two Arrays
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>answer=new ArrayList<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int num:nums2)
        {
            set2.add(num);
        }
        for(int num:nums1)
        {
            set1.add(num);
        }
        List<Integer>list1=new ArrayList<>();
        for(int num:set1)
        {
            if(!set2.contains(num))list1.add(num);
        }
        List<Integer>list2=new ArrayList<>();
        for(int num:set2)
        {
            if(!set1.contains(num))list2.add(num);
        }
        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}

// Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int ind1=0;
        int ind2=0;
        while(ind1<word1.length() && ind2<word2.length())
        {
            sb.append(word1.charAt(ind1)).append(word2.charAt(ind2));
            ind1++;
            ind2++;
        }
        while(ind1<word1.length()){
            sb.append(word1.charAt(ind1));
            ind1++;
        }
        while(ind2<word2.length()){
            sb.append(word2.charAt(ind2));
            ind2++;
        }
        return sb.toString();
    }
}
