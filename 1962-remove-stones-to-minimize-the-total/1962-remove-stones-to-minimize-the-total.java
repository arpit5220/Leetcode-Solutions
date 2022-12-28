class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<piles.length;i++)
        {
            pq.add(piles[i]);
        }
        
        int t=k;
        while(t-->0)
        {
            int val=pq.poll();
            int p=val/2;
            pq.add(val-p);
        }
        
        int count=0;
        while(pq.size()>0)
        {
            count+=(pq.peek());
                pq.remove();
        }
        
        return count;
    }
}