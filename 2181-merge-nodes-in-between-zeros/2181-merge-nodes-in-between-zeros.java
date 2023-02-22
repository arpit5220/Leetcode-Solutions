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
    public ListNode mergeNodes(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode dummy=new ListNode(-1);
        // ListNode head1=dummy;
        ListNode tail=dummy;
        int count=0;
        
        while(head!=null)
        {
            if(head.val!=0)
            {
                count+=head.val;
            }
            
            else
            {
                if(count!=0){
                ListNode temp=new ListNode(count);
                tail.next=temp;
                tail=tail.next;
                }
                count=0;
                
            }
            
            head=head.next;
        }
        
        return dummy.next;
    }
}