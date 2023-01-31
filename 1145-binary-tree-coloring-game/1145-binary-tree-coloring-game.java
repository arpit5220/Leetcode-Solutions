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
    
    int xKaleftsize=0;
    int xKarightsize=0;
    
     public int size(TreeNode node,int x)
     {
         if(node==null)
           return 0;
         
         int ls=size(node.left,x);
         int rs=size(node.right,x);
         
         if(node.val==x)
         {
             xKaleftsize=ls;
             xKarightsize=rs;
         }
         
         
         int ts=ls+rs+1;
         return ts;
     }
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        size(root,x);
        
        int theOtherside=n-(xKaleftsize + xKarightsize + 1);
        int maxOfthree=Math.max(theOtherside,Math.max(xKaleftsize,xKarightsize));
        
        int rest=n-maxOfthree;
        if(maxOfthree>rest)
            return true;
        else
            return false;
        
    }
}