class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
             int val1=nums[i]-k;
             int val2=k+nums[i];
            
            if(hm.containsKey(val1))
            {
                int p1=hm.get(val1);
                count+=p1;
            }
            if(hm.containsKey(val2))
            {
                int p2=hm.get(val2);
                count+=p2;
            }
            
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
                 
        }
        
        return count;
    }
}