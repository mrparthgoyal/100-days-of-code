// day6

// keyboard row
class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String>res=new ArrayList<>();
        for(String word:words)
        {
            String lower=word.toLowerCase();
            if(helper(lower,row1)||helper(lower,row2)||helper(lower,row3))res.add(word);
        }
        return res.toArray(new String[0]);
    }
    static boolean helper(String word,String row)
    {
        for(char ch:word.toCharArray())
        {
            if(row.indexOf(ch)==-1)return false;
        }
        return true;
    }
}

// intersection of two arrays
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums1)
        {
            set.add(num);
        }
        HashSet<Integer>intersection=new HashSet<>();
        for(int num:nums2)
        {
            if(set.contains(num))intersection.add(num);
        }
        int[]res=new int[intersection.size()];
        int i=0;
        for(int num:intersection)
        {
            res[i++]=num;
        }
        return res;
    }
}