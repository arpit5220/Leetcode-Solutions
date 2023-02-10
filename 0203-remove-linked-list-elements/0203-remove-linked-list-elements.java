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
    public ListNode removeElements(ListNode head, int val){
     ListNode curr=head;
        ListNode it=curr;
        while(curr!=null && curr.val==val){
            head=curr.next;
            curr=head;
        }
        while(curr!=null){
            if(curr.val==val){
               
                it.next=curr.next;
                curr=it.next;
            }
            else{
                it=curr;
                curr=curr.next;
            }
            
        }
        
        return head;
    }
}