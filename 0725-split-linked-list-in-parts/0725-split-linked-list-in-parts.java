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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode [] ans=new ListNode[k];
        
        int totallen=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            totallen++;
        }
        
        
        int len=totallen/k;
        int distribute=totallen%k;
        
        ListNode temp=head;
        ListNode prev=null;
        int i=0;
        
        while(temp!=null && i<k)
        {
            
            ans[i]=temp;
            
            for(int j=0;j<len+(distribute>0?1:0);j++)
            {
                prev=temp;
                temp=temp.next;
            }
            
            prev.next=null;
            i++;
            distribute--;
            
        }
        
        return ans;
        
    }
}