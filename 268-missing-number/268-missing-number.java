class Solution {
public int missingNumber(int[] nums) {

    int x=0,n=nums.length;
	
	for(int k:nums) {
		x+=k;
	}
	int sum=n*(n+1)/2;
    
    return sum-x;
}
}