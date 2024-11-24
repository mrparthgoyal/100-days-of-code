// day19
// Word Pattern
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]words=s.split(" ");
        if(pattern.length()!=words.length)return false;
        HashMap<Character,String>charToWord=new HashMap<>();
        HashMap<String,Character>wordToChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String word=words[i];
            if(charToWord.containsKey(ch))
            {
                if(!charToWord.get(ch).equals(word))return false;
            }
            else {
                if(wordToChar.containsKey(word))return false;
            }
            charToWord.put(ch,word);
            wordToChar.put(word,ch);
        }
        return true;
    }
}

// detect capital
class Solution {
    public boolean detectCapitalUse(String word) {
        int capCount=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))capCount++;
        }
        if(capCount==word.length() || capCount==0 ||(capCount==1 && Character.isUpperCase(word.charAt(0))))return true;
        return false;
    }
}
