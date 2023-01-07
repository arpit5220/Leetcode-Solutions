class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
 
        int totalGas = 0, totalCost = 0;
        
        for(int i = 0 ; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) 
            return -1;
    
        int remainsGas = 0, start = 0;
       
        for(int i = 0 ; i < gas.length; i++)
        {
            remainsGas+=(gas[i] - cost[i]);
            if(remainsGas < 0 )
            {
                start = i+1;
                remainsGas = 0;
            }
        }
        return start;
    }
}