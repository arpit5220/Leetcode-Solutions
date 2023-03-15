class Solution {
    public int findCircleNum(int[][] arr) {
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>> ();
        
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1 && i!=j)
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        
        int [] visited=new int[n];
        int cnt=0;
        for(int i=0;i<list.size();i++)
        {
            if(visited[i]==0)
            {
                cnt++;
                dfs(i,list,visited);
            }
        }
        
        return cnt;
    }
    
    
    public static void dfs(int node,ArrayList<ArrayList<Integer>> list,int visited[])
    {
        visited[node]=1;
        for(Integer it:list.get(node))
        {
            if(visited[it]==0)
            {
                dfs(it,list,visited);
            }
        }
    } 
}