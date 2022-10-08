class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
       List<List<Integer>> result=new ArrayList<>();
        
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++)
        {
            ArrayList<Integer> arr=new ArrayList<>();
            if(hm.containsKey(groupSizes[i]))
            { 
                arr=hm.get(groupSizes[i]);
            }
            
                arr.add(i);
                hm.put(groupSizes[i],arr);
         
            if (arr.size() == groupSizes[i]){
                result.add(arr);
                hm.remove(groupSizes[i]);
            }
                  
        }
        
        return result;
    }
} 



   /*    List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> group = new ArrayList<>();
            
            if (map.containsKey(groupSize)) {
                group = map.get(groupSize);
            }
            
            group.add(i);
            map.put(groupSize, group);
            
            if (group.size() == groupSize){
                result.add(group);
                map.remove(groupSize);
            }
        }   
        
        return result;   
}
}*/