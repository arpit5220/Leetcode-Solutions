class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        
        int a=first(arr,arr.length,target);
        int b=last(arr,arr.length,target);

        int [] res=new int[2];
        res[0]=a;
        res[1]=b;

        return res;
    }

    public static int first(int [] arr, int n, int k)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==k)
            {
                ans=mid; 
                high=mid-1;   
            }
            else if(arr[mid]>k)
            {
                high=mid-1;
            }
            else
              low=mid+1;
        }

        return ans;
    }
    

    public static int last(int [] arr, int n, int k)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==k)
            {
                ans=mid; 
                low=mid+1;   
            }
            else if(arr[mid]>k)
            {
                high=mid-1;
            }
            else
              low=mid+1;
        }

        return ans;
    }
}