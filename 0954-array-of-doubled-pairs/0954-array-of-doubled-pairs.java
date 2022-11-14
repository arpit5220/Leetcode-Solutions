class Solution {
    public boolean canReorderDoubled(int[] arr) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int val:arr)
        {
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        
        Arrays.sort(arr);
        
        for(int val:arr)
        {
            if(val==0) continue;
            
            if(hm.containsKey(val) && hm.containsKey(val*2))
            {
                if(hm.getOrDefault(val,0)>1)
                {
                    hm.put(val,hm.getOrDefault(val,0)-1);
                }
                else
                {
                    hm.remove(val);
                }
                
                if(hm.getOrDefault(2*val,0)>1)
                {
                    hm.put(2*val,hm.getOrDefault(2*val,0)-1);
                }
                else
                {
                    hm.remove(2*val);
                }
            }
        }
        
        if(hm.size()==0)
        {
            return true;
        }
        else if(hm.size()==1 && hm.containsKey(0))
            return true;
        else
            return false;
    }
}