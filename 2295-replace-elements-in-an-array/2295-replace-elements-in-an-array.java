class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
           hm.put(nums[i],i);
        }
        
         for(int [] op:operations)
         {
             int oldval=op[0];
             int newval=op[1];
             int index=hm.get(op[0]);
             
             //replace
             nums[index]=newval;
             
             // update the index
             hm.put(newval,index);
             
             // remove element from map
             hm.remove(oldval);

         }
        
        return nums;   
        
    }
}