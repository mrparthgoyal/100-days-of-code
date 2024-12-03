// Reverse Words in a String III
class Solution {
    static String reverse(String word)
    {
        StringBuilder sb=new StringBuilder(word);
        String str=sb.reverse().toString();
        return str; 
    }
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        String[]words=s.split("\\s+");
        for(String word:words)
        {
            sb.append(reverse(word)).append(" ");
        }
        return sb.toString().trim();
    }
}

// To Lower Case
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}