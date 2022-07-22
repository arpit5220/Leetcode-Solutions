class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // USING HASHMAP
        HashMap<Integer,Integer> hm =new HashMap<>();
        
        for(int i:nums)
        {
            if(hm.containsKey(i))
                return true;
            else
                hm.put(i,1);
        }
        
        return false;
        
        
//         // USING HASHSET
        
//         HashSet<Integer> set=new HashSet<>();
        
//         for(int val:nums)
//         {
//             if(set.contains(val))
//                 return true;
            
//             set.add(val);
//         }
        
//         return false;
    
        
    }
}