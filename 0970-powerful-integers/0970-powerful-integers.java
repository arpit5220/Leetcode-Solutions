class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        if(bound<=1) return list;
        else if(x==1 && y==1) {
            list.add(2);
            return list;
        }
        else if(x==1)
        {
            for(int vy=1;vy<bound;vy*=y)
            { 
                int val=1+vy;
                if(set.contains(val)==false)
                {
                    set.add(val);
                    list.add(val);
                }
            }
            
           
        }
        
        else if(y==1)
        {
            for(int vx=1;vx<bound;vx*=x)
            {
                int val=1+vx;
                if(set.contains(val)==false)
                {
                    set.add(val);
                    list.add(val);
                }
            }
        }
        
        else{
        for(int vx=1;vx<bound;vx*=x)
        {
            for(int vy=1;vx+vy<=bound;vy*=y)
            {
                int val=vx+vy;
                if(set.contains(val)==false){
                    set.add(val);
                    list.add(val);
                }
            }
        }
        }
        
        return list;
    }
}