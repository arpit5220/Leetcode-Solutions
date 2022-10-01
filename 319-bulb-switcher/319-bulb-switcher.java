class Solution {
    public int bulbSwitch(int n) {
        
        if(n==0)
            return 0;
        double sq=Math.sqrt(n);
        double floor=Math.floor(sq);
        
        return (int)floor;
            
    }
}