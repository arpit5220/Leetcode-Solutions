class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int exact=0;
        int rem=0;
        int ans=numBottles;
        while(numBottles>=numExchange)
        {
            exact=(numBottles/numExchange);
            
            rem=(numBottles%numExchange);
            
            ans+=exact;
            
            numBottles=exact+rem;
            
        }
        
        
        return ans;
    }
}