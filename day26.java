// split balanced strings
class Solution {
    public int balancedStringSplit(String s) {
        int balance=0;
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='L')balance++;
            else balance--;
            if(balance==0)count++;
        }
        return count;
    }
}

// decode string
class Solution {
    public String decodeString(String s) {
        Stack<Integer>countStack=new Stack<>();
        Stack<String>result=new Stack<>();
        int currentNumber=0;
        String currentString="";
        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                currentNumber=currentNumber*10+(ch-'0');
            }
            else if(ch=='[')
            {
                countStack.push(currentNumber);
                result.push(currentString);
                currentNumber=0;
                currentString="";
            }
            else if(ch==']')
            {
                int repeatTimes=countStack.pop();
                StringBuilder decoded=new StringBuilder(result.pop());
                for(int i=0;i<repeatTimes;i++)
                {
                    decoded.append(currentString);
                }
                currentString=decoded.toString();
            }
            else
            {
                currentString+=ch;
            }
        }
        return currentString;
    }
}