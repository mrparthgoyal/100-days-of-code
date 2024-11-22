// day17
// First Unique Character in a String
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)return i;
        }
        return -1;
    }
}

// Find the Difference
class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char ch:s.toCharArray())
        {
            ans=(char)(ans^ch);
        }
        for(char ch:t.toCharArray())
        {
            ans=(char)(ans^ch);
        }
        return ans;
    }
}