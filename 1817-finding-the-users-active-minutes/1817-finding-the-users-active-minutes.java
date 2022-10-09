import java.util.Map.Entry;
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int [] result=new int[k];
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++)
        {
            
            if(map.get(logs[i][0])==null)
               {
                   HashSet<Integer> set=new HashSet<>();
                   set.add(logs[i][1]);
                   map.put(logs[i][0],set);
               }
               
               else
               {
                   HashSet<Integer> set=map.get(logs[i][0]);
                   set.add(logs[i][1]);
                   map.put(logs[i][0],set);
               }
        }
        
        Iterator<Entry<Integer,HashSet<Integer>>> iter=map.entrySet().iterator();
        
        while(iter.hasNext())
        {
            Entry<Integer,HashSet<Integer>> e=iter.next();
            HashSet<Integer> set=e.getValue();
            
            result[set.size()-1]++;
        }
        
        return result;
    }
}