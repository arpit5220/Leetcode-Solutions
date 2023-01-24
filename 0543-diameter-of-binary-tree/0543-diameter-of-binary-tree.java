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
    int maxdiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        dmeter(root);
        return maxdiameter;
    }
    
    public  int dmeter(TreeNode root)
    {
           if(root==null)
              return -1;
          
          int lefth=dmeter(root.left);
          int righth=dmeter(root.right);
          
          int diameter=lefth+righth+2;
          maxdiameter=Math.max(maxdiameter,diameter);
          
          return Math.max(lefth,righth)+1;
    }
}