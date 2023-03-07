class Solution {
    public int removeElement(int[] A, int elem) {
    int len = A.length;
    for (int i = 0 ; i< len; ++i){
        while (A[i]==elem && i< len) {
            A[i]=A[--len];
        }
    }
    return len;
}
}