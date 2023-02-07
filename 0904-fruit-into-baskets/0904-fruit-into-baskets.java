class Solution {
    public int totalFruit(int[] fruits) {
        
        int [] count=new int[fruits.length];
        
        int start=0;
        
        int max=0;
        int currmax=0;
        int type=0;
        int n=fruits.length;
       for(int i=0;i<n;i++)
       {
           if(count[fruits[i]]==0)
           {
               type++;
           }
           
           count[fruits[i]]++;
           currmax++;
           
           while(type>2 && start<i)
           {
               count[fruits[start]]--;
               if(count[fruits[start]]==0)
               {
                   type--;
               }
               start++;
               currmax--;
           }
           
           max=Math.max(max,currmax);
       }
        
        return max;
    }
}