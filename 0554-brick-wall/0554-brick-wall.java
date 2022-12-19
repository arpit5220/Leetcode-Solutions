class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int max=0;
       // int prefix=0;
        for (List<Integer> row : wall) 
        {
            int prefix = 0;

            for (int i = 0; i < row.size() - 1; i++)
            {
                int n=row.get(i);
                prefix+=n;
                hm.put(prefix,hm.getOrDefault(prefix,0)+1);
                max=Math.max(max,hm.get(prefix));
            }
        }
        
        return wall.size()-max;
    }
}