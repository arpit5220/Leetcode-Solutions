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
    
    ArrayList<String> list=new ArrayList<>();
    public String smallestFromLeaf(TreeNode root) { 
        if(root==null)
            return null;
        String str="";
        traverse(root,str);
        
        Collections.sort(list);
        return list.get(0);
    }
    
    public void traverse(TreeNode root,String str)
    {
        if(root==null)
            return;
        
        str+=((char)(root.val+97) +"");
        
        if(root.left==null && root.right==null)
        {
           StringBuilder sb2 = new StringBuilder(str);
           String s =  sb2.reverse().toString();

            list.add(s);
            return;
        }
    
        traverse(root.left,str);
        traverse(root.right,str);

    }
}