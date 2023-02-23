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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        
         return mergelist(list1,list2);
    }
    
    public void inorder(TreeNode root,List<Integer> list)
    {
        
        if(root==null)
            return;
        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
        
    }
    
    public List<Integer> mergelist(List<Integer> list1,List<Integer> list2)
    {
        List<Integer> res=new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<list1.size() && j<list2.size())
        {
            if(list1.get(i)<list2.get(j)){
                res.add(list1.get(i));
                i++;
            }
            else
            {
                res.add(list2.get(j));
                j++;
            }
        }
        
        while(i<list1.size())
        {
            res.add(list1.get(i));
                i++;
        }
        
        while(j<list2.size())
        {
            res.add(list2.get(j));
                j++;
        }
        
        return res;
    }
}