class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],true);
        }
        
        for(int val:nums)
        {
            if(hm.containsKey(val-1))
            {
                hm.put(val,false);
            }
        }
        
        int max=0;
        for(int val:nums)
        {
            if(hm.get(val)==true)
            {
                int length=1;
                while(hm.containsKey(val+length)==true)
                {
                    length++;
                    
                }
                
                max=Math.max(max,length);
            }
        }
        
        
        return max;
        
        
    }
}