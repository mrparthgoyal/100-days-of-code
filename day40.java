//day40
// Palindrome Linked List
class Solution {
    static ListNode reverseList(ListNode head)
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        // find the middle of the linkedlist and reverse the second half
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firstHalf=head;
        ListNode secondHalf=reverseList(slow);
        // compare first and second halves
        while(secondHalf!=null)
        {
            if(firstHalf.val!=secondHalf.val)return false;
            else
            {
                firstHalf=firstHalf.next;
                secondHalf=secondHalf.next;
            }
        }
        return true;
    }
}

// Remove Linked List Elements
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)head=head.next;
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            if(current.val==val)
            {
                if(prev!=null)
                {
                    // remove the current node
                    prev.next=current.next;
                }
            }
            // update prev only if current node has not been removed
            else
            {
                prev=current;
            }
            current=current.next;
        }
        return head;
    }
}