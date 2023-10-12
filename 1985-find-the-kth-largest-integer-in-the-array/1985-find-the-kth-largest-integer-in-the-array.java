import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<BigInteger> pq=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            String str=nums[i];
            
            BigInteger bigInteger = new BigInteger(str);
            
            pq.add(bigInteger);
            
            //pq.add(str);
            
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        
        return pq.peek().toString();
            
        
    }
}