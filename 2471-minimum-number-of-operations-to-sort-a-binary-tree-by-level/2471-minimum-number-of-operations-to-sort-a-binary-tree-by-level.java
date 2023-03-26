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
    public int minimumOperations(TreeNode root) {
        
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        int s=0;
        while(pq.size()>0)
        {
            int counter=pq.size();
            int[] arr = new int[counter];
            for(int i=0;i<counter;i++)
            {
                TreeNode temp=pq.remove();
                arr[i]=temp.val;
                if(temp.left!=null)
                {
                    pq.add(temp.left);
                }
                if(temp.right!=null)
                {
                    pq.add(temp.right);
                }
            
            }
            
            s+=(SelectionSort(arr)); 
        }
        
        return s;
    }
    
     private int SelectionSort(int[] arr) {
        int swapsCount = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                
                swapsCount++;
            }
        }
        
        return swapsCount;
}
}