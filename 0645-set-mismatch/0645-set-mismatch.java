class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
         for (int n: nums) 
           hm.put(n, hm.getOrDefault(n, 0) + 1);
        
        
        int twice=0;
       int miss=0;
        for(int i=1;i<=nums.length;i++)
        {
            if(hm.containsKey(i)){
           
                if(hm.get(i)==2)
                    twice=i;       
            }
            
            else
              miss=i;
        }
       
         return new int[]{twice,miss};
        
      
    }
}