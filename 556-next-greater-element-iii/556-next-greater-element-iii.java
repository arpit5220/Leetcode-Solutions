class Solution {
    public int nextGreaterElement(int n) {
        
        
   //   String str=String.valueOf(n);
        char [] arr=(""+n).toCharArray();
        int i=arr.length-2;
       
        
         
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        
        if(i==-1) return -1;
        
        int j=arr.length-1;
        while(j>i && arr[j]<=arr[i]){
            j--;
        }
        
        swap(arr,i,j);
        reverse(arr,i+1); 
        
    long res= Long.parseLong(new String(arr));
    
    if(res>Integer.MAX_VALUE){ //chexk if it's in range
    return -1;
    }
        
    return (int)res;
        
    }
    
    public void reverse(char [] arr,int start)
    {
        int l=start;
        int r=arr.length-1;
        while(l<r)
        {
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    
    public  void swap(char [] arr,int i,int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}