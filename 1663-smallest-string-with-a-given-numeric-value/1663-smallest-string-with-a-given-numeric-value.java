class Solution {
    public String getSmallestString(int n, int k) {
          char[] arr=new char[n];
          Arrays.fill(arr,'a');
          k=k-n;
       for(int i=n-1;i>=0;i--){
            
            if(k>25){
              arr[i]='z';
              k-=25;
             }
           else if(k==0) break;
            else{
            arr[i]=(char)('a'+k);
            k-=k;
           }
        }
        
         return new String(arr);
    }
}