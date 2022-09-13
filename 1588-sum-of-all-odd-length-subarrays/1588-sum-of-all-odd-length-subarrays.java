class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i+=2)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j<n)
                {
                    for(int k=0;k<=i;k++)
                        sum+=arr[j+k];
                }
            }
        }
        
        return sum;
    }
}


