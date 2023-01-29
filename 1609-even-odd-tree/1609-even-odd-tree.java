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
    public boolean isEvenOddTree(TreeNode root) {
        
        Queue<TreeNode> pq=new ArrayDeque<>();
	    pq.add(root);
	    ArrayList<Integer> list=new ArrayList<>();
	    int i=1;
        
	    while(pq.size()>0)
	    {
	        int counter=pq.size();
	        
	        for(int j=0;j<counter;j++)
	        {
	            TreeNode temp=pq.remove();
	            
	            if(i%2!=0)
	            {
	                list.add(temp.val);
	            }
	            
	            if(i%2==0)
                {
                    list.add(temp.val);
                }  
	            
	            if(temp.left!=null)
	               pq.add(temp.left);
	               
	            if(temp.right!=null)
	                pq.add(temp.right);
	        }
	        
            if(i%2!=0)
            {
               int v=list.get(0);
                if(v%2==0)
                    return false;
             for(int k=1;k<list.size();k++)
             {
                 if(list.get(k)%2!=0 && v<list.get(k))
                 {
                     v=list.get(k);
                     continue;
                 }
                 else
                   return  false;
             }
                
            }
            
            if(i%2==0)
            {
               int v1=list.get(0);
                if(v1%2!=0)
                    return false;
             for(int k=1;k<list.size();k++)
             {
                 if(list.get(k)%2==0 && v1>list.get(k))
                 {
                     v1=list.get(k);
                     continue;
                 }
                 else
                    return false;
             }
                
            }
            
            list=new ArrayList<>();
	        i++;
            
           
	    }
	    
	    return true;
    }
}