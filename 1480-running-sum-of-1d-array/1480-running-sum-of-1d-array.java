class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=sum+nums[i];
            sum=nums[i];
        }
        
        return nums;
        
    }
}