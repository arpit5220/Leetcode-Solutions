class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length)
        {
            while(i<nums.length && nums[i]%2==0)
                i=i+2;
            while(j<nums.length && nums[j]%2==1)
                j=j+2;
          if(i<nums.length){  
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i+=2;
            j+=2;
          }
        }
        return nums;
    }
    
   
}