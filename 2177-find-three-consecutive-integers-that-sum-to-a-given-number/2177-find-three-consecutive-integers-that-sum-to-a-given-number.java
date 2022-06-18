class Solution {
    public long[] sumOfThree(long num) {
        
        long x=num/3;
        
       // long [] res=new long[3];
        
//         res[0]=(x-1);
//         res[1]=(x);
//         res[2]=(x+1);
        
        if(3*x==num)
        {
            long [] res=new long[3];
            res[0]=(x-1);
             res[1]=(x);
             res[2]=(x+1);
             return res;
        }
        else
            return new long[0];
            
            
            
	// public long[] sumOfThree(long num) {
	// if (num % 3 != 0) {
	// 	return new long[0];
	// }
	// long a = num / 3 - 1;
	// return new long[] {a, a + 1, a + 2};
	// }
        
    }
}