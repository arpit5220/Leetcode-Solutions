class Solution {
    public int[] singleNumber(int[] nums) {
        
        int a=0,b=0;
        
        int x=0;
      //  int rsbm=x&(~x+1);
        
        for(int i=0;i<nums.length;i++)
        {
              x=x^nums[i];
        }
        
        int rsbm=x&(~x+1);
        
      // int a=0;
      //  int b=0;
        for(int i=0;i<nums.length;i++)
        {
            if((rsbm & nums[i])==0)
                a=a^nums[i];
            
            else
                b=b^nums[i];
        }
        
        return new int[]{a,b};
    }
}