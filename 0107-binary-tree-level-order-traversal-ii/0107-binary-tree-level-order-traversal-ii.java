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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> pq=new ArrayDeque<>();
        pq.add(root);
        
        while(pq.size()>0)
        {
            int counter=pq.size();
            
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<counter;i++)
            {
                TreeNode node=pq.remove();
                
                list.add(node.val);
                
                if(node.left!=null)
                    pq.add(node.left);
                if(node.right!=null)
                    pq.add(node.right);
            }
            
            res.add(0,list);
        }
        
        return  res;
    }
}