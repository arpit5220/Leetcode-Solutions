class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length<3) return false;
        
        int i;
        int c=0;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            {
                c++;
                break;
            }
            
            else if(arr[i]==arr[i-1])
            {
                c++;
                return false;
            }
        }
        
       if(c==0) return false;
        if(i<2) return false;          // if [4,3,2,1]
        for(int j=i;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                continue;
            }
            
            else if(arr[j]<=arr[j+1])
                return false;    
                
        }
        
        return true;
    }
}