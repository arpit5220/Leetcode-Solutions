class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right=height.length-1;
        int water=0;
        while(left<right)
        {
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            
            water=Math.max(water,h*width);
            
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
                
        }
        
        return water;
        
    }
}