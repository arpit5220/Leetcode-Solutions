class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int [] arr=new int[nums.length];
        
        int i=0;
        int j=nums.length-1;
        int p=nums.length-1;
        
        while(i<=j)
        {
            int val1=nums[i]*nums[i];
            int val2=nums[j]*nums[j];
            if(val1 > val2)
            {
                arr[p--]=val1;
                i++;
            }
            else 
            {
                arr[p--]=val2;
                j--;
            }
   
        }
        
        return arr;
    }
}