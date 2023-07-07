class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
        }
        
        
        while(hm.size()!=0)
        {
             List<Integer> row = new ArrayList<>();
            
            for (Integer key: set)
            {
                if(hm.containsKey(key))
                {
                   row.add(key);
                   int x=hm.get(key);
                   if(x==1)
                   {
                     hm.remove(key);
                  }
                  else
                  {
                    hm.put(key,x-1);
                  }
                }
            }
            
            res.add(row);
        }
        
        return res;
    }
}