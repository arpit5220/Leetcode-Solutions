class Solution {
    public int reinitializePermutation(int n) {
        int[] perm=new int[n];
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            perm[i]=i;
            nums[i]=i;
        }
        int operation=1;
        while(true){
            int[] arr=performOperation(perm,n);
            if(isEqualToInitial(arr,nums)) return operation;
            perm=arr;
            operation++;
        }
     
    }
    
    private boolean isEqualToInitial(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false;;
        }
        return true;
    }
    
    private  int[] performOperation(int[] perm,int n){
          int[] arr=new int[n];
        for(int i=0;i<perm.length;i++){
            if(i%2==0){
              arr[i]=perm[i/2];
            }else{
                arr[i]=perm[n/2 + (i-1)/2];
            }
        }
        return arr;
    }
}