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
    
     public ListNode middle(ListNode head)
     {
         ListNode slow=head;
         ListNode fast=head;
         
         while(fast!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         
         return slow;
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
    
    public int pairSum(ListNode head) {
        
        if(head.next.next==null)
        {
            return head.val+head.next.val;
        }
        
        ListNode temp=middle(head);
        ListNode curr=reverse(temp);
        int count=0;
        
        while(curr!=null)
        {
            System.out.print("<-"+curr.val+"  "+head.val+"-> ");
            count=Math.max(count,head.val+curr.val);
            head=head.next;
            curr=curr.next;
        }
        
        return count;
    }
}