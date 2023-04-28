class Solution {
    public int numSimilarGroups(String[] strs) {
        
        int count=0;
        int [] visited=new int[strs.length];
        for(int i=0;i<strs.length;i++)
        {
            if(visited[i]==1)
                continue;
            
            count++;
            dfs(i,strs,visited);
        }
        
        return count;
    }
    
    public void dfs(int i,String [] strs,int []visited)
    {
        visited[i]=1;
        
        for(int j=0;j<strs.length;j++)
        {
            if(visited[j]==1)
                continue;
            if(similar(strs[i],strs[j]))
            {
                dfs(j,strs,visited);
            }
        }
    }
    
    public boolean similar(String str1,String str2)
    {
        int cnt=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
                cnt++;
        }
        
        return (cnt==2 || cnt==0);
    }
}