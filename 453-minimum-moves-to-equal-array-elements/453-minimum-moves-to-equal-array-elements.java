class Solution {
    public int minMoves(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        
        Arrays.sort(nums);
        int smallest=nums[0];
        
        return sum-(nums.length)*smallest;
    }
}