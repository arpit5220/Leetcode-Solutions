class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
    
    public void combination(int idx,int [] arr,int target,List<List<Integer>> ans,List<Integer> ds)
    {
        if(target==0)
        {  
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            
            ds.add(arr[i]);
            combination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}