//day43
// remove nodes from the linkedlist
class Solution {
    static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode revHead=reverse(head);
        ListNode prev=revHead;
        ListNode nextNode=prev.next;
        while(nextNode!=null)
        {
            if(prev.val>nextNode.val)
            {
                ListNode temp=nextNode;
                prev.next=nextNode.next;
                nextNode=nextNode.next;
                temp.next=null;
            }
            else if(prev.val<=nextNode.val)
            {
                prev=nextNode;
                nextNode=nextNode.next;
            }
        }
        return reverse(revHead);
    }
}

// linkedlist cycle 2
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}