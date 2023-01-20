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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> l=new ArrayList<>();
        Queue<TreeNode> pq=new ArrayDeque<>();    
        pq.add(root);
        
        while(pq.size()>0)
        {
            int count=pq.size();
            long sum=0;
            for(int i=0;i<count;i++)
            {
                TreeNode node=pq.remove();
                 sum=sum+node.val;
                
                if(node.left!=null)
                    pq.add(node.left);
                
                  if(node.right!=null)
                    pq.add(node.right);
      
            }
                double avg=(double)sum/count;
                l.add(avg);   
        }
        
        return l;
    }
}