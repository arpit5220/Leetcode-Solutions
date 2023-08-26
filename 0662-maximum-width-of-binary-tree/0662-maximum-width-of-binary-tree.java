/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
//         if(root==null)
//             return 0;
        
//         Deque<TreeNode> pq=new LinkedList<>();
//         pq.add(root);
//         int max=1;
        
//         while(pq.size()>0)
//         {
//             while(!pq.isEmpty() && pq.getFirst()==null) pq.removeFirst();
//             while(!pq.isEmpty() && pq.getLast()==null)  pq.removeLast();
            
//              max=Math.max(max,pq.size());
//              int counter=pq.size();
            
//             for(int i=0;i<counter;i++)
//             {
//                 TreeNode node=pq.poll();
//                 if(node==null)
//                 {
//                     pq.add(null);
//                     pq.add(null);
//                 }
//                 else{
//                 pq.add(node.left);
//                 pq.add(node.right);
//                 }
                
//             }
            
//         }
        
//         return max;
//     }
        
        Deque<Pair> pq=new LinkedList<>();
        pq.add(new Pair(root,0));
        int ans=0;
        
        while(pq.size()>0)
        {
           // Pair curr=pq.removeFirst();
           // TreeNode temp=curr.node;
            int f=pq.getFirst().idx;
            
            int l=pq.getLast().idx;
            //int l=curr2.idx;
            
            int index=l-f+1;
            
            ans=Math.max(ans,index);
            int n=pq.size();
            
            for(int i=0;i<n;i++)
            {
                Pair curr=pq.removeFirst();
                TreeNode temp=curr.node;
                int idxx=curr.idx;
                
                if(temp.left!=null)
                {
                    int newidx=2*idxx+1;
                    pq.add(new Pair(temp.left,newidx));
                }
                
                if(temp.right!=null)
                {
                    int newidx=2*idxx+2;
                    pq.add(new Pair(temp.right,newidx));
                }
            }
              
        }
        
        return ans;
        
    }
}

class Pair
{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx)
    {
        this.node=node;
        this.idx=idx;
    }
}