// day 20
// Isomorphic Strings
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character>sTot=new HashMap<>();
        HashMap<Character,Character>tTos=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(sTot.containsKey(sChar) && sTot.get(sChar)!=tChar)return false;
            if(tTos.containsKey(tChar) && tTos.get(tChar)!=sChar)return false;
            sTot.put(sChar,tChar);
            tTos.put(tChar,sChar);
        }
        return true;
    }
}

// Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)return true;
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))right--;
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))return false;
            left++;
            right--;
        }
        return true;
    }
}