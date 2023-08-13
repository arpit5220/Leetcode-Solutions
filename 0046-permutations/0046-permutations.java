class Solution {
    public List<List<Integer>> permute(int[] nums) {
  
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,nums,ans);
        return ans;
    }
        
     
    public void solve(int index,int [] nums,List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int val:nums)
            {
                ds.add(val);
            }
            ans.add(ds);
            return;
        }
        
        for(int i=index;i<nums.length;i++)
        {
            swap(i,index,nums);
            solve(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
        
      public void swap(int a,int b,int [] nums)
      {
          int temp=nums[a];
          nums[a]=nums[b];
          nums[b]=temp;
      }
        

}
        
        
        
        // USING O(N) SPACE
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> ds=new ArrayList<>();
//         boolean [] freq=new boolean[nums.length];
//         solve(nums,ans,ds,freq);
//         return ans;
//     }
    
//     public void solve(int [] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] freq)
//     {
//         if(ds.size()==nums.length)
//         {
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(freq[i]==false)
//             {
//                 freq[i]=true;
//                 ds.add(nums[i]);
//                 solve(nums,ans,ds,freq);
//                 ds.remove(ds.size()-1);
//                 freq[i]=false;
//             }
//         }
//     }
// }