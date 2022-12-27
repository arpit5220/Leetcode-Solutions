class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int [] remaningCapacity=new int[capacity.length];
        // we make a array which denote the remaning capacity of each bags
        for(int i=0;i<capacity.length;i++)
        {
            remaningCapacity[i]=capacity[i]-rocks[i];
        }
        
        Arrays.sort(remaningCapacity); // we want first which have less capacity to full fill    
        
       // int fullbags=0;
        int count=0;
        for(int i=0;i<rocks.length;i++)
        {
            
            if(remaningCapacity[i]<=additionalRocks)
            {
                additionalRocks-=remaningCapacity[i];
                count++;
            }
            
            else 
               break; 
            
        }
        
        return count;
        
    }
}