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
    static ArrayList<Integer> preorderTraversal(TreeNode root)
    {
       // Your code goes here
       // Node,L,R,
       ArrayList<Integer> list=new ArrayList<>();
       preOrderProcess(root,list);
       return list;
    }
    
     static void preOrderProcess(TreeNode root,ArrayList<Integer>list)
    {
        if(root==null) return;
        
        list.add(root.val);
        preOrderProcess(root.left,list);
        preOrderProcess(root.right,list);
        
    }
}