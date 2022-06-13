class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k);
        for(int val:nums)
        {
            pq.add(val);             //--> Time O(nlogk);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        
        return pq.peek();
        
    }
}