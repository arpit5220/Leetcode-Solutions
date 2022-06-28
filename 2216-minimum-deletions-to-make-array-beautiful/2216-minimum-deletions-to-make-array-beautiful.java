class Solution {
    public int minDeletion(int[] nums) {
        
        int d=0;
        int n=nums.length;
        
        for(int i=0;i<n-1;i++)
        {
            int newidx=i-d;
            if(newidx%2==0) 
            {
                if(nums[i]== nums[i+1])
                    d++;
            }
        }
        
        return ((n-d)%2==0) ? d:d+1;
            
    }
}