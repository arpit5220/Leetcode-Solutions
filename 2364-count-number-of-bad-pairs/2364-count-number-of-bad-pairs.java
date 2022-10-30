/*class Solution {
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
}   */

class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long totalPairs=getPairs(n);
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<n;i++){
            map.put(i-nums[i],map.getOrDefault(i-nums[i],0)+1);
        }
        long pairs=0;
        for(int key : map.keySet()){
            if(map.get(key)==1){
                continue;
            }
            
            pairs+=getPairs(map.get(key));
        }
        return totalPairs-pairs;
    }
    
    public long getPairs(long n){
        return (n*(n-1))/2;
    }
    
}
