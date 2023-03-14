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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
         
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        
        int size=count-n;
        
        if(size<0)
            return null;
        
        if(size==0)
            return head.next;
        
        ListNode temp=head;
        int p=0;
        while(p!=size-1)
        {
            p++;
            temp=temp.next;
        }
        
        temp.next=temp.next.next;
        
        return head;
          
    }
}