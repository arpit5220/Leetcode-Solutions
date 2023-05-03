class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        
        for(int val:nums1)
        {
            set1.add(val);
        }
        
        for(int val:nums2)
        {
            set2.add(val);
        }
        
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<Integer>());
        res.add(new ArrayList<Integer>());
        
        for(int val:set1)
        {
            if(set2.contains(val)==false)
                res.get(0).add(val);
        }
        
         for(int val:set2)
        {
            if(set1.contains(val)== false)
                res.get(1).add(val);
        }
        

        return res;
    }
}