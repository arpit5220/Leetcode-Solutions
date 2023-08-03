class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
      //  ArrayList<Integer> res=new ArrayList<>();
        
//         List<List<Integer>> res=new ArrayList<>();
        
//         res.add(new ArrayList<>());
        
//         for(int num:nums)
//         {
//             int n=res.size();
//             for(int j=0;j<n;j++)
//             {
//                 List<Integer> temp=new ArrayList<>(res.get(j));
//                 temp.add(num);
//                 res.add(temp);
//              }
//         }
        
//         return res;
        
        
        List<List<Integer>> res=new ArrayList<>();
        print(0,nums,new ArrayList<>(),res);
        return res;
        
    }
    
    
    public void print(int idx,int [] nums,List<Integer> subset,List<List<Integer>> res)
    {
        if(idx==nums.length){
           // print(res);
            res.add(new ArrayList<>(subset));
         
            return;
        }
        
        
      //for the current element 
        subset.add(nums[idx]);
        print(idx +1, nums , subset ,res);

        //exclude the current element
        subset.remove(subset.size() - 1 );
        print(idx +1 , nums,subset , res);
        
        
    }
    
    
}