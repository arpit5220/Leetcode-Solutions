class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        int [] arr=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            set1.add(A[i]);
            set2.add(B[i]);
            
             int count=0;
             for(int j=0;j<=i;j++)
             {
                 if(set1.contains(A[j]) && set2.contains(A[j]))
                 {
                     count++;
                 }
             }
            
            arr[i]=count;
            
        }
        
        return arr;
    }
}