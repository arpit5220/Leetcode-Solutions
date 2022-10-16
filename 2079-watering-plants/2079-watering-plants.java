class Solution {
    public int wateringPlants(int[] plants, int capacity) {
    
        int  cap=capacity;
        int step=0;
        int count=0;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=cap){
            cap-=plants[i];
                step++;
                count++;
            }
            
            else
            {
                cap=capacity;
                step+=(2*count)+1;
                cap-=plants[i];
                count++;
            }
        }
        
        return step;
    }
}