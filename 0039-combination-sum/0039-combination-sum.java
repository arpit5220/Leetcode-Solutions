class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    public void combination(int idx,int [] arr,int target,List<List<Integer>> ans,List<Integer> ds)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[idx]<=target)
        {
            ds.add(arr[idx]);
            combination(idx,arr,target-arr[idx],ans,ds);
            ds.remove(ds.size()-1);
        }
        combination(idx+1,arr,target,ans,ds);
    }
}