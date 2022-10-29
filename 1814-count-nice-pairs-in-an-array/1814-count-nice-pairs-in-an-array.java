class Solution {
    public int countNicePairs(int[] nums) {
      
      int n = nums.length;
      long count = 0;
      Map<Integer, Integer> map = new HashMap<>();

      for(int i=0;i<n;i++){
        int temp = nums[i]-rev(nums[i]);
         if(map.containsKey(temp)){
               count += map.get(temp);
         }
             map.put(temp,map.getOrDefault(temp,0)+1);
      }
     
        return (int)(count%1000000007);
        
    }
    public static  int rev(int n){
       int sum = 0;
        while(n>0){
          int rem = n%10;
          sum = sum*10 + rem;
          n = n/10;
        }
        return sum;
      }
}