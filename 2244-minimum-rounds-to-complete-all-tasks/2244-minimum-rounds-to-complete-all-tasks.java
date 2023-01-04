class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
        }
        
        
        int count=0;
        for(int key:hm.keySet())
        {
            int val=hm.get(key);
            
            if(hm.get(key)==1)
                return -1;
            
                if(val%3==0)
                {
                   int c=val/3;
                    count+=c;
                }
            
             else
             {
                 count+=(val/3)+1;
             }
                
        }
        
        return count;
        
        
    }
}