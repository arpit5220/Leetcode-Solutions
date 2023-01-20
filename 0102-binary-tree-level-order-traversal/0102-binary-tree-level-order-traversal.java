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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> pq=new ArrayDeque<>();
        pq.add(root);
        
        while(pq.size()>0)
        {
            int count=pq.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<count;i++)
            {
                TreeNode node=pq.remove();
                 
                l.add(node.val);
                
                if(node.left!=null)
                    pq.add(node.left);
                if(node.right!=null)
                    pq.add(node.right);
            }
            
            res.add(l);
        }
        
        return res;
        
    }
}