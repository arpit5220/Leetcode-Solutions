class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
       while(result.size()<n){
          ArrayList<Integer> temp=new ArrayList<>();
           for(int val:result)
           {
               //for even
               if(2*val-1<=n)
               {
                   temp.add(2*val-1);
               }      
           }
           
           for(int val:result)
           {
               if(val*2<=n)
                   temp.add(val*2);
           }
           
           result=temp;  
       }
        
        
         int [] res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=result.get(i);
        }
        
        return res;
    }
}