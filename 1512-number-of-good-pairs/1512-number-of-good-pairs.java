class Solution {
    public int numIdenticalPairs(int[] nums) {
           
        //    O(N)  TIME
        //    O(N)  SPACE
        
       int freq[] =new int[101];
        for(int num:nums)
        {
            freq[num]++;
        }
        
        int count=0;
        
        for(int i:freq)
        {
            count+=(i*(i-1))/2;
        }
        
        
        return count;
    }
}