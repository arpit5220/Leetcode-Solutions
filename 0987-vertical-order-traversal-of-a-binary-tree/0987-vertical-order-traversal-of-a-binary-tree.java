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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> hm=new TreeMap<>();
        Queue<Pair> pq=new ArrayDeque<>();
        pq.add(new Pair(root,0,0));
        
        while(pq.size()>0)
        {
            int counter=pq.size();
            
            for(int i=0;i<counter;i++)
            {
                Pair temp=pq.remove();
                TreeNode curr=temp.node;
                int v=temp.vh;
                int l=temp.level;
                
                if(!hm.containsKey(v))
                    hm.put(v,new TreeMap<>());
                
                if(!hm.get(v).containsKey(l))
                    hm.get(v).put(l,new PriorityQueue<>());
                
                 hm.get(v).get(l).offer(curr.val);
                 
                if(curr.left!=null)
                    pq.add(new Pair(curr.left,l+1,v-1));
                    
                if(curr.right!=null)
                    pq.add(new Pair(curr.right,l+1,v+1));
            }
        }
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int val:hm.keySet())
        {
            TreeMap<Integer,PriorityQueue<Integer>> v=hm.get(val);
            ArrayList<Integer> arr=new ArrayList<>();
            for(int value:v.keySet())
            {
                PriorityQueue<Integer> p=v.get(value);
                while(p.size()>0)
                {
                    arr.add(p.poll());
                }
            }
            
            ans.add(arr);
        }
        
        return ans;
        
    }
     
    
}

class Pair
{
    int level;
    int vh;
    TreeNode node;
    Pair(TreeNode node,int level,int vh)
    {
        this.node=node;
        this.level=level;
        this.vh=vh;
    }
}
    
