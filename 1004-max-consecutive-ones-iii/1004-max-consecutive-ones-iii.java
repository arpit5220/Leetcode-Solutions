class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int ans=0;
        int i=0;
        int j=-1;
        int count=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count++;
            
            while(count>k)
            {
                j++;
                if(nums[j]==0)
                    count--;
            }
            
            int len=i-j;
            ans=Math.max(ans,len);
        }
        
        return ans;
    }
}