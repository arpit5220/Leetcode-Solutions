class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           
           Arrays.sort(nums);
           int n=nums.length;
           List<List<Integer>> res=new ArrayList<>();
           for(int i=0;i<nums.length;i++)
           {
             if(i!=0 && nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<nums.length;j++)
             {
                if(j!=i+1 && nums[j]==nums[j-1]) continue;

                int si=j+1;
                int ei=n-1;

                while(si<ei)
                {
                  long sum=(long)nums[i]+nums[j]+nums[si]+nums[ei];
                  if(sum>target) ei--;
                  else if(sum<target) si++;
                  else if(sum==target) {
                   
                    res.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[si],nums[ei])));
                     si++;
                    ei--;

                    while(si<ei && nums[si]==nums[si-1]) si++;
                    while(si<ei && nums[ei]==nums[ei+1]) ei--;
                  }
                }
             }
           }

           return res;


    }
}