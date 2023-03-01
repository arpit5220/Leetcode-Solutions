/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
//         if(root==null)
//             return root;
        
        // 1ST APPROACH USING BFS
        
//         Queue<Node> pq=new ArrayDeque<>();
//         pq.add(root);
        
//         while(pq.size()>0)
//         {
//            // Node top=pq.remove();
//             int counter=pq.size();
//             Node prev=null;
//             for(int i=0;i<counter;i++)
//             {
//                 Node top=pq.remove();
//                 top.next=prev;
//                 prev=top;
               
//                 if(top.right!=null)
//                     pq.add(top.right);
                
//                 if(top.left!=null)
//                     pq.add(top.left);
                
//             }
//         }
        
//         return root;
        
        // 2ND APPROACH  // without space
        
       if(root==null)
           return null;
        Node curr=root;
        Node head=null;
        Node tail=null;
        
        while(curr!=null)
        {
            while(curr!=null)
            {
                if(curr.left!=null)
                {
                    if(head==null)
                    {
                        head=curr.left;
                        tail=curr.left;
                    }
                    else
                    {
                        tail.next=curr.left;
                        tail=curr.left;
                    }
                }
                
                if(curr.right!=null)
                {
                    if(head==null)
                    {
                        head=curr.right;
                        tail=curr.right;
                    }
                    else
                    {
                        tail.next=curr.right;
                        tail=curr.right;
                    }
                }
                
                curr=curr.next;
            }
            
            curr=head;
            head=null;
            tail=null;
        }
      
        return root;
        
    }
}