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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        
        Queue<TreeNode> pq=new ArrayDeque<>();
        pq.add(root);
        
        while(pq.size()>0)
        {
            int counter=pq.size();
            
            for(int i=0;i<counter;i++)
            {
                TreeNode node=pq.remove();
                
                if(i==counter-1)
                    res.add(node.val);
                
                if(node.left!=null)
                    pq.add(node.left);
                if(node.right!=null)
                    pq.add(node.right);
                
            }
        }
        
        return res;
    }
}