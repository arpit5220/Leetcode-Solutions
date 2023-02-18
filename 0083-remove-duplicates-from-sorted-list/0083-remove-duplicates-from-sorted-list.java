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
        if(head.next==null)
            return head;
        
        ListNode curr=head;
        ListNode prev=curr;
        while(curr.next!=null)
        {
            curr=curr.next;
            if(curr.val==prev.val){
                prev.next=curr.next;
            }
            else
            {
                prev=prev.next;
            }   
        }
        
        return head;
        
        
    }
}