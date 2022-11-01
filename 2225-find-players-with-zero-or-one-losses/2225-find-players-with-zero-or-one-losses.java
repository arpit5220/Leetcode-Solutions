class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        List<Integer> win = new LinkedList<>();
        List<Integer> lost = new LinkedList<>();
        for(int [] arr : matches){
            int looser = arr[1];
            int winner= arr[0];
            map1.put(winner, 0);
            map.put(looser,map.getOrDefault(looser, 0)+1);
        }
        for(int key: map.keySet()){
            if( map.get(key)==1)
                lost.add(key);
        }
        for(int key: map1.keySet()){
            if(!map.containsKey(key))
                win.add(key);
        }
        Collections.sort(win);
        Collections.sort(lost);
        list.add(win);
        list.add(lost);
        return list;
    }
}