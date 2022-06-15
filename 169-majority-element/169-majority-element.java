class Solution {
public int majorityElement(int[] nums) {
// int n=nums.length;   // BRUTE FORCE SOLUTION
// int majoritySize = n / 2;
// for(int num : nums) {
// int count = 0;
// for(int elem : nums) {
// if(num == elem) {
// count++;
// }
// }
// if(count > majoritySize) {
// return num;
// }
// }
// return -1;
 
    int count=0;
    int candidate=0;
    
    for(int num:nums)
    {
        if(count==0)
            candidate=num;
        if(num==candidate)
            count+=1;
        else
            count-=1;
    }
    
    return candidate;
}
}

