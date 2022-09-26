class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        
        if(nums.length<3) return false;
        
        
       int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= min){
                min = nums[i];
            }
            else if(nums[i] < secMin){ 
                secMin = nums[i];
            }
            else if(nums[i] > secMin) {
                return true;
            }
        }
        return false;
        
        
    }
}