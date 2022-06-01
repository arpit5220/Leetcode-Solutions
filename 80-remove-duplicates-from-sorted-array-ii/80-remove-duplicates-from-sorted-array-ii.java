class Solution {
    public int removeDuplicates(int[] nums) {
          
        if(nums.length<3)
            return nums.length;
        
        int s=2;
        for(int f=s;f<nums.length;f++){
            if(nums[f]!=nums[s-2])
                nums[s++]=nums[f];
            
        }
        
        
       return s;

    }
}



// class Solution{
// public int removeDuplicates(int[] nums) {
//    int i = 0;
//    for (int n : nums)
//       if (i < 2 || n > nums[i - 2])
//          nums[i++] = n;
//    return i;
// }
// }