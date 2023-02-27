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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || k==0 || head.next==null)
            return head;
        
        ListNode curr=head;
        int size=0;  
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        
        if(k==size)
            return head;
        
        if(k>size)
        k=k%size;
        
        if(k==0)
            return head;
        
        int s=size-k;
        
        s--;
        ListNode temp=head;
        while(s!=0)
        {
            temp=temp.next;
            s--;
        }
        
        ListNode one=temp.next;
        temp.next=null;
        
        ListNode curr2=one;
        while(curr2.next!=null)
        {
            curr2=curr2.next;
        }
         
        curr2.next=head;
        
        return one;
        
        
        
    }
}