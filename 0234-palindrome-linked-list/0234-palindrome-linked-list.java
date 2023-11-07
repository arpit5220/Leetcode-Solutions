/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid=middle(head);
        ListNode second=reverse(mid.next);
        mid.next=null;
        
        while(head!=null && second!=null)
        {
            if(head.val!=second.val) return false;
            head=head.next;
            second=second.next;
        }
        
        return true;
        
        
    }
    
    
    public ListNode middle(ListNode node)
    {
        ListNode slow=node;
        ListNode fast=node;
        ListNode prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast==null)
            return prev;
        return slow;
    }
    
    
    
    public ListNode reverse(ListNode head)
    {
         ListNode prev=null;
         ListNode curr=head;
        
        while(curr!=null)
        {
            ListNode ahead=curr.next;       
            curr.next=prev; 
            prev=curr;
            curr=ahead;
        }
        
        return prev;
    }
}