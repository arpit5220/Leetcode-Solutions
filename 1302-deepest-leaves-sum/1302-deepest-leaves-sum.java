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
    public int deepestLeavesSum(TreeNode root) {
        
        Queue<TreeNode> pq=new ArrayDeque<>();
        pq.add(root);
        
        while(pq.size()>0)
        {
            
            int counter=pq.size();
            int sum=0;
            int j=0;
            for(int i=0;i<counter;i++)
            {
                TreeNode temp=pq.remove();
                 sum+=temp.val;
                if(temp.left!=null)
                {
                    pq.add(temp.left);
                    j++;
                }
                if(temp.right!=null)
                {
                    pq.add(temp.right);
                    j++;
                }
            }
            
            if(j==0)
            {
                return sum;
            }
              
        }
        
        return -1;
    }
}