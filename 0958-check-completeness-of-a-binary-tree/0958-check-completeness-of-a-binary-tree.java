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
    public boolean isCompleteTree(TreeNode root) {
        
        if(root==null)
            return true;
        Queue<TreeNode> pq=new LinkedList<>();
        pq.offer(root);
        
        boolean SeenNull=false;
        
        while(pq.size()>0)
        {
            TreeNode node=pq.poll();
            
            if(node==null)
            {
                SeenNull=true;
            }
            else
            {
                if(SeenNull==true)
                {
                    return false;
                }
                
                    pq.offer(node.left);
                    pq.offer(node.right);
                
            }
        }
        
        return true;
        
    }
}