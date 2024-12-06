//day31
// median of two sorted arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int totalLength=n+m;
        int mid=totalLength/2;
        boolean isEven=totalLength%2==0;
        int i=0,j=0,current=0,prev=0;
        for(int k=0;k<=mid;k++)
        {
            prev=current;
            if(i<n && (j>=m || nums1[i]<=nums2[j]))
            {
                current=nums1[i++];
            }
            else 
            {
                current=nums2[j++];
            }
        }
        if(isEven)
        {
            return (current+prev)/2.0;
        }
        else return current;
    }
}

// valid parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                if((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='{' && s.charAt(i)=='}') || (st.peek()=='[' && s.charAt(i)==']'))
                {
                    st.pop();
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.isEmpty())return true;
        else return false;
    }
}
