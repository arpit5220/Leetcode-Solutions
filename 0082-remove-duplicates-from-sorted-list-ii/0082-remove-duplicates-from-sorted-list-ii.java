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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
        
        while(head!=null)
        {
            ListNode curr=head;
            int i=0;
            while(curr!=null && curr.val==head.val)
            {
                curr=curr.next;
                i++;
            }
            
            if(i==1)
            {
                tail.next=head;
                tail=tail.next;
                head=curr;
            }
            else
            {
                head=curr;
            }
        }
        
        tail.next=null;
        
        return dummy.next;
        
    }
}