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
    public ListNode partition(ListNode head, int x) {
        
        ListNode rightdummyhead=new ListNode(-1);
        ListNode rTail=rightdummyhead;
        ListNode leftdummyhead=new ListNode(-1);
        ListNode lTail=leftdummyhead;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                lTail.next=head;
                lTail=lTail.next;
                head=head.next;
            }
            else
            {   
                rTail.next=head;
                rTail=rTail.next;
                head=head.next;
            }
            
        }
        
        lTail.next=rightdummyhead.next;
        rTail.next=null;
        
        return leftdummyhead.next;
        
    }
}