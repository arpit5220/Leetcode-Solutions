class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = i-nums[i];
            map.put(difference,map.getOrDefault(difference,0)+1);
        }
        
        long total_pairs = (long)nums.length * (nums.length-1) / 2;       //nC2
        long good_pairs = 0L;
        for(int key: map.keySet()){
            if( map.get(key) > 1){
                long value = map.get(key);
                good_pairs += value*(value-1)/2;         //nC2
            }
        }
        return total_pairs - good_pairs;
    }
}