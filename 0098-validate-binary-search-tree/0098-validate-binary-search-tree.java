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
    
    class Pair
    {
        boolean isBST=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    public boolean isValidBST(TreeNode root) {
        
        Pair rp = helper(root);
        return rp.isBST;
        
    }
    
     public Pair helper(TreeNode node)
     {
         if(node==null)
             return new Pair();
         
         Pair lp=helper(node.left);
         Pair rp=helper(node.right);
         
         
         Pair mp=new Pair();
         mp.min=Math.min(node.val,Math.min(lp.min,rp.min));
         mp.max=Math.max(node.val,Math.max(lp.max,rp.max));
         
         mp.isBST=lp.isBST && rp.isBST && node.val > lp.max && node.val < rp.min;
         
         
         return mp;
     }
    
     
}