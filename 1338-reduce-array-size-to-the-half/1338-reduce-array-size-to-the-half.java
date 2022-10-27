class Solution { 
     public int minSetSize(int[] a) {
         Map<Integer, Integer> m = new HashMap<>();
        for (int n : a) 
            m.put(n, m.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());  // Max priority Queue
        for (int n : m.keySet()) pq.offer(m.get(n));  // offer used to add element in  priority queue
        int res = 0, sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();   // poll used to get element and delete at at same time from priority queue
            res++;
            if (sum >= (a.length + 1) / 2) return res;
        }
        return 0;
     }
 }
