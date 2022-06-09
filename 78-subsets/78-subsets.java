class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
      //  ArrayList<Integer> res=new ArrayList<>();
        
        List<List<Integer>> res=new ArrayList<>();
        
        res.add(new ArrayList<>());
        
        for(int num:nums)
        {
            int n=res.size();
            for(int j=0;j<n;j++)
            {
                List<Integer> temp=new ArrayList<>(res.get(j));
                temp.add(num);
                res.add(temp);
             }
        }
        
        return res;
    }
}