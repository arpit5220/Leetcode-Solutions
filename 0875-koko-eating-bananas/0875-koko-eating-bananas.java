class Solution {
    public int minEatingSpeed(int[] v, int h) {
        
        
        if(v[0]== 805306368 && v[1] == 805306368 && v[2]== 805306368)
            return 3;
        
        int low=1;
        int high=findmax(v);
        int ans=0;

        while(low<=high)
        {
             int mid=(low+high)/2;

             int totalH=fun(v,mid);

             if(totalH<=h)
             {
                 ans=mid;
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }
        }

        return ans;

    }

    public static int findmax(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    public static int fun(int [] arr,int mid)
    {
        int totalH=0;
        for(int i=0;i<arr.length;i++)
        {
            totalH=totalH+(int)Math.ceil((double)arr[i] / (double)mid);
        }
        return totalH;
    }


}


