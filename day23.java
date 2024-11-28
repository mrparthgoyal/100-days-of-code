// day23
// Delete Characters to Make Fancy String
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        int count=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))count++;
            else count=1;
            if(count<3)sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

// Remove All Adjacent Duplicates In String
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<Character>();
        for(char ch:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==ch) st.pop();
            else st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
