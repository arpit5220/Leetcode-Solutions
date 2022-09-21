class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int ans = 0;
        int sum = 0;
        int result[] = new int[queries.length];
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0)sum += A[i];
        }
        for(int i = 0; i < queries.length; i++){
            int temp = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            
            if(Math.abs(A[queries[i][1]]) % 2 == 0){
                sum = sum + A[queries[i][1]];
            }
            if(temp % 2 == 0){
                sum -= temp;
            }
             result[i] = sum;
        }
        return result;
    }
}