// class Solution {
//      public int[] shuffle(int[] nums, int n) {
//         int[] res = new int[2 * n];
//         for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
//             res[idx++] = nums[i];
//             res[idx++] = nums[j];
//         } 
//         return res;
//     }
// }


// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int max = 1001; // M in the above explanation
        
// 		//Store number pairs in right half
//         for(int i=n;i<nums.length;i++){
//             nums[i] = max*nums[i]+nums[i-n];
//         }
        
// 		//Put pairs in proper positions
//         int ind = 0;
//         for(int i=n;i<nums.length;i++){
//             nums[ind] = nums[i]%max;
//             nums[ind+1] = nums[i]/max;
//             ind+=2;
//         }
        
//         return nums;
//     }
// }


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int start = 0;
        int[] arr = new int[2*n];
        int news = 0;
        while (n < nums.length) {
            arr[news] = nums[start];
            arr[news+1] = nums[n];
            n++;
            news = news + 2;
            start++;
        }
        return arr;
    }
}