class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left = 0;
        int right = 0;
        
        for (int num : nums) {
            right += num;
        }
        
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            
            int fromLeft = nums[i] * i - left;
            int fromRight = right - (nums.length - i - 1) * nums[i];
            result[i] = fromLeft + fromRight;
            
            left += nums[i];
        }
        
        return result;
    }
}