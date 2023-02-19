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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
            return res;
        if(root.left==null && root.right==null)
        {
            ArrayList<Integer> l=new ArrayList<>();
            l.add(root.val);
            res.add(l);
            return res;
        }
        
        Queue<TreeNode> pq=new ArrayDeque<>();
        pq.add(root);
        int level=0;
        while(pq.size()>0)
        {
            int counter=pq.size();
            level++;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<counter;i++)
            {
                TreeNode temp=pq.remove();
                list.add(temp.val);
                
                if(temp.left!=null)
                    pq.add(temp.left);
                if(temp.right!=null)
                    pq.add(temp.right);
            }
            
            if(level%2==0)
            {
                Collections.reverse(list);
                res.add(list);
            }
            else
                res.add(list);
        }
        
        return res;
    }
}