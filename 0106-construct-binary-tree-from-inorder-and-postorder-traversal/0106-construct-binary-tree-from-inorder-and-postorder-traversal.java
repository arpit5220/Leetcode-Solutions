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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            int val=inorder[i];
            map.put(val,i);
        }
        TreeNode root=construct(0,postorder.length-1,0,inorder.length-1,postorder,map);
        return root;
    }
    
    

     public TreeNode construct(int post_lo,int post_hi,int in_lo,int in_hi,int post[],HashMap<Integer,Integer> map)
    {  
        if(post_lo > post_hi || in_lo > in_hi)
            return null;
        
        TreeNode node=new TreeNode();
        
        node.val=post[post_hi];
        
        int index=map.get(post[post_hi]);
        int lhs=index-in_lo;
        
        node.left= construct (post_lo,post_lo+lhs-1,in_lo,index-1,post,map);
        node.right= construct (post_lo+lhs,post_hi-1,index+1,in_hi,post,map);
                               
        return node;
        
    }
}