// day38
// middle of the linked list
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}

// swapping nodes in a linkedlist
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null)return null;
        ListNode first=head;
        ListNode second=head;
        ListNode current=head;

        // find the kth node from beginning
        for(int i=1;i<k;i++)
        {
            first=first.next;
        }

        // find the kth node from ending using 2 pointer approach
        ListNode temp=first;
        while(temp.next!=null)
        {
            temp=temp.next;
            second=second.next;
        }

        // swap the values of kth from beginnning and kth from end
        int tempVal=first.val;
        first.val=second.val;
        second.val=tempVal;
        
        return head;
    }
}