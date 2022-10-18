class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i=A.length-3;i >= 0;i--)
           temp=A[i]+A[i+1]>A[i+2]?A[i] + A[i+1] + A[i+2]:A[i+2];  

          return temp;
        return 0;
    }
}
