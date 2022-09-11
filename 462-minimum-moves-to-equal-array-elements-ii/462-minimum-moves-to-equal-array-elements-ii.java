class Solution {
    public int minMoves2(int[] nums) {
        
        
        Arrays.sort(nums);
        
        int mid=(nums.length)/2;
        int minmov=0;
        for(int i=0;i<nums.length;i++)
        {
            minmov+=(Math.abs(nums[i]-nums[mid]));
        }
        
        return minmov;
    }
}