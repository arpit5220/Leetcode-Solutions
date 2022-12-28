class Solution {
    public int halveArray(int[] nums) {
        
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0.00;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            pq.add((double)nums[i]);
        }
        
        double s=sum/2;
        
       // int summ=0;
        int step=0;
        while(sum>s)
        {
            double val=pq.poll();
            double half=val/2;
            
            sum=sum-val;
            sum=sum+half;
            step++;
            
            pq.add(half);
            
        }
        
        return step;
    }
}