class Solution {
    public void sortColors(int[] arr) {
        // int hash[] = new int[3];
        // for(int i = 0; i<nums.length;i++)
        // {
        //     hash[nums[i]]++;
        // }
        // int idx = 0;
        // for(int i = 0; i<3; i++)
        // {
        //         for(int j = hash[i]; j>0;j--)
        //     {
        //         nums[idx++] = i;
        //     }
        // }
        
         int lo=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                    {
                        int temp=arr[lo];
                        arr[lo]=arr[mid];
                        arr[mid]=temp;
                        lo++;
                        mid++;
                        break;
                    }
                    
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2:
                    {
                        int temp=arr[mid];
                        arr[mid]=arr[high];
                        arr[high]=temp;
                        high--;
                        break;
                    }
            }              
            
        }
    }
}