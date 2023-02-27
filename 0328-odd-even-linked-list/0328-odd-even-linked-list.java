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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
            return null;
        
        if(head.next==null)
            return head;
        
        ListNode edummy=new ListNode(-1);
        ListNode odummy=new ListNode(-1);
        
        ListNode etail=edummy; // eventail
        ListNode otail=odummy; // oddtail
        
        ListNode curr=head;
        int counter=1;
        while(curr!=null)
        {
            if(counter%2==1)
            {
                otail.next=curr;
                otail=otail.next;
            }
            else
            {
                etail.next=curr;
                etail=otail.next;
            }
             
            counter++;
            curr=curr.next;
        }
        
         etail.next=null;
         otail.next=null;
        
        otail.next=edummy.next;
        
        return odummy.next;
    }
}