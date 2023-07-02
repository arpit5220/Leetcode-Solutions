class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],i);
        }
        
       for(int i=0;i<n;i++)
       {
           int val=target-nums[i];
           
           if(hm.containsKey(val))
           {
               int index=hm.get(val);
               if(index==i) continue;
               return new int[] {index,i};
           }
       }
        
        return new int[]{};
        
    }
}