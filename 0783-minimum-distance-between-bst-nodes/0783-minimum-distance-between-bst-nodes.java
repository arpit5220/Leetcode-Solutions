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
    // List to store the tree nodes in the inorder traversal.
    List<Integer> inorderNodes = new ArrayList<>();
    
    void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorderTraversal(root.left);
        // Store the nodes in the list.
        inorderNodes.add(root.val);
        inorderTraversal(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
       inorderTraversal(root);
        
        int minDistance = Integer.MAX_VALUE;
        // Find the diff between every two consecutive values in the list.
        for (int i = 1; i < inorderNodes.size(); i++) {
            minDistance = Math.min(minDistance, inorderNodes.get(i) - inorderNodes.get(i-1));
        }
        
        return minDistance;
    }
};