/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==headB)
            return headA;
        ListNode curr1=headA;
        int count1=0;
        while(curr1!=null)
        {
            curr1=curr1.next;
            count1++;
        }
        
        ListNode curr2=headB;
        int count2=0;
        while(curr2!=null)
        {
            curr2=curr2.next;
            count2++;
        }
        
        int diff=Math.abs(count1-count2);
        ListNode node1=headA;
        ListNode node2=headB;
        if(count1>=count2)
        {
            int size1=diff;
            while(size1>0)
            {
                node1=node1.next;
                size1--;
            }
            
            ListNode one=node1;
            ListNode two=headB;
            while(one!=two && (one!=null && two!=null))
            {
                one=one.next;
                two=two.next;
                
            }
            
            if(one==null && two==null)
                return null;
            else
                return one;
        }
        
      else if(count1<count2)
        {
            int size2=diff;
            while(size2>0)
            {
                node2=node2.next;
                size2--;
            }
            ListNode one=node2;
            ListNode two=headA;
            while(one!=two && one!=null && two!=null)
            {
                one=one.next;
                two=two.next;
            }
            
            if(one==null && two==null)
                return null;
            else
                return one;
        }
        
        return null;
        
    }
}