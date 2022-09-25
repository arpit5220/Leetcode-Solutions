class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        // List<List<Integer>> res = new ArrayList();
      //  List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int target=0-nums[i];
            
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k)
            {
                if(nums[j]+nums[k]==target)
                {
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]>target)
                {
                    k--;
                }
                else
                {
                    j++;
                }
                    
            }
        }
        
        return new ArrayList<>(res);
    }
}