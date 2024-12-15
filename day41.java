// day41
// double a number represented as linked list
class Solution {
    static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode revHead=reverse(head);
        ListNode temp=revHead;
        int carry=0;
        while(temp!=null)
        {
            int dbl=temp.val*2+carry;
            carry=dbl/10;
            temp.val=dbl%10;
            if(temp.next==null && carry>0)
            {
                temp.next=new ListNode(carry);
                break;
            }
            temp=temp.next;
        }
        return reverse(revHead);
    }
}

// linked list cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }
}