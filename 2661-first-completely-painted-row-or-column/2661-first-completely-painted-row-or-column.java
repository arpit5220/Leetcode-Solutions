class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],i);
        }
        
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            int curr=Integer.MIN_VALUE;
            for(int j=0;j<m;j++)
            {
                curr=Math.max(curr,hm.get(mat[i][j]));
            }
            
            ans=Math.min(ans,curr);
        }
        
        for(int j=0;j<m;j++)
        {
            int curr=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                curr=Math.max(curr,hm.get(mat[i][j]));
            }
            
            ans=Math.min(ans,curr);
        }
        
        return ans;
    }
}