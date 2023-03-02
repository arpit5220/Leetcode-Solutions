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
     List<String> list=new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        if(root==null)
            return list;
        if(root.left==null && root.right==null)
        {
            list.add(root.val+"");
            return list;
        } 
            
        String strb="";
          helper(root,strb);
          return list;
        
    }

    
     public void helper(TreeNode root,String strb)
     {
         if(root==null)
             return;
         
         strb=strb+root.val;
         
         if(root.left==null && root.right==null)
         {
            
             list.add(strb);
             return;
         }
         
         
         strb=strb+"->";
         
         helper(root.left,strb);
         helper(root.right,strb);
         
     }
}