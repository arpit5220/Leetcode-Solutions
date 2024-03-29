class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> heights = new ArrayList<>();
        
        // transforming buildings
        for (int[] building : buildings) {          // O(n)
            heights.add(new int[] {building[0], -building[2]});
            heights.add(new int[] {building[1], building[2]});
        }
        
        Collections.sort(heights, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);    // O(nlogn)
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.offer(0);
        
        int prevMax = 0;
        
        for (int[] height : heights) {  // O(n)
            
            if (height[1] < 0) pq.offer(-height[1]);    // takes O(logn)
            else pq.remove(height[1]);                  // takes O(n)
            
            int currMax = pq.peek();
            
            if (currMax != prevMax) {
                res.add(Arrays.asList(height[0], currMax));
                prevMax = currMax;
            }
        }
        
        return res;
    }
}

// TC: O(n) +O(n * (n + logn)) => O(n ^ 2)
// SC: O(n) 