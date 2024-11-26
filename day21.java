// day21
// is subsequence
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex=0;
        int tIndex=0;
        while(sIndex<s.length() && tIndex<t.length())
        {
            if(s.charAt(sIndex)==t.charAt(tIndex))sIndex++;
            tIndex++;
        }
        return sIndex==s.length();
    }
}

// number of segements in a string
class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s==null || s.isEmpty())return 0;
        String[]words=s.split("\\s+");
        return words.length; 
    }
}
