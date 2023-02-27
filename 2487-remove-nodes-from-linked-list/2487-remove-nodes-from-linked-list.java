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
        
      //  head=prev;
        return prev;
    }
    
    public ListNode removeNodes(ListNode head) {
        
        if(head.next==null)
            return head;
        
        ListNode temp=reverse(head);
        
        ListNode prev=temp;
        ListNode head2=temp;
        int max=head2.val;
        
        while(head2!=null)
        {
            max=Math.max(max,head2.val);
            
            if(head2.val < max)
            {
                prev.next=prev.next.next;
            }
            else
            {
                prev=head2;
            }
            
            head2=head2.next;
        }
        
        ListNode ans=reverse(temp);
        
        return ans;
        
    }
}