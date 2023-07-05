class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        int [] arr=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            set1.add(A[i]);
            set2.add(B[i]);
            
            HashSet<Integer> res=new HashSet<>(set1);
            res.retainAll(set2);
            
            arr[i]=res.size();
            
        }
        
        return arr;
    }
}