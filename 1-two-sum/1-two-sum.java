class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int t=nums[i];
            int rem=target-t;
            if(hm.containsKey(rem))
            {
                int index=hm.get(rem);
                if(index==i) continue;
                return new int[]{i,index};
                    
            }
        }
        
        return new int[]{};
    }
}