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
        
         if(head.next==null) return true;;
        
         ListNode mid=findmid(head); 
         ListNode second=reverse(mid.next);
        
        while(head != null && second != null){
            if(head.val != second.val) return false;
            head = head.next;
            second = second.next;
        }
        return true;
             
         
    }
    
    
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null)
        {
            ListNode ahead=curr.next;
            
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        
        return prev;
    }
    
    public ListNode findmid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head; 
        ListNode prev=head;
        
        while(fast!=null && fast.next!=null)
        {
             prev=slow;
             slow=slow.next;
             fast=fast.next.next;
        }
        
        if(fast==null)
        {
            return prev;
        }
        else
            return slow;
    }
}