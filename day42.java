// day42
// reverse linked list 2
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        // move prev to node before left
        for(int i=1;i<left;i++)
        {
            prev=prev.next;
        }
        ListNode current=prev.next; // current node at the left position
        ListNode forward;
        // reverse sublist between left and right
        for(int i=0;i<right-left;i++)
        {
            forward=current.next; // temporarily store the next node
            current.next=forward.next; // remove forward from the sublist
            forward.next=prev.next; // insert forward at the front of reversed part
            prev.next=forward; // update prev to point to the new head of the reversed part
        }
        return dummy.next;
    }
}

// Convert Binary Number in a Linked List to Integer
class Solution {
    public int getDecimalValue(ListNode head) {
        int result=0;
        while(head!=null)
        {
            result=(result<<1)|head.val;
            head=head.next;
        }
        return result;
    }
}