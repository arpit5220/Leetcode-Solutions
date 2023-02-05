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
        
        if(root==null)
            return root;
        
        Queue<Node> pq=new ArrayDeque<>();
        pq.add(root);
        
        while(pq.size()>0)
        {
           // Node top=pq.remove();
            int counter=pq.size();
            Node prev=null;
            for(int i=0;i<counter;i++)
            {
                Node top=pq.remove();
                top.next=prev;
                prev=top;
               
                if(top.right!=null)
                    pq.add(top.right);
                
                if(top.left!=null)
                    pq.add(top.left);
                
            }
        }
        
        return root;
        
    }
}