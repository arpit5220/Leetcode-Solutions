class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        solve(0,s,ans,ds);
        return ans;
    }
    
    public void solve(int index,String str,List<List<String>> ans,List<String> ds)
    {
        if(index==str.length())
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<str.length();i++)
        {
            if(isPalindrome(str,index,i))
            {
                ds.add(str.substring(index,i+1));
                solve(i+1,str,ans,ds);
                ds.remove(ds.size()-1);
            }
               
        }
    }
    
  public boolean isPalindrome(String str,int start,int end)
       {
            while(start<=end)
            {
                if(str.charAt(start++)!=str.charAt(end--))
                {
                    return false;
                }
            }
           
           return true;
       }
}