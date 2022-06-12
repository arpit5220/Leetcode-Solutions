class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int max=0;
        int runningsum=0;
        
        int i=0;
        int j=0;
        
        Set<Integer> set=new HashSet<>();
            
        while(i<nums.length)
        {
            int ele=nums[i];
            if(!set.contains(ele))
            {
                set.add(ele);
                runningsum+=ele;
                max=Math.max(max,runningsum);
                i++;
            }
            else
            {
                int deleteEle=nums[j];
               set.remove(deleteEle);
                runningsum=runningsum-deleteEle;
                j++;
                
            }
            
        }
        
        return max;
        
        
    }
}