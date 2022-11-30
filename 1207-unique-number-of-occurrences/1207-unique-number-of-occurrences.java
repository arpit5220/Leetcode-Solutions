class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int t=arr[i];
            if(hm.containsKey(t))
            {
                hm.put(t,hm.get(t)+1);
            }
            else{
            hm.put(t,1);
            }
        }
        
        //checking if there are duplicate counts
        HashSet<Integer> set=new HashSet<>(hm.values());
		//if there are no duplicate counts then the expression below will evaluate to true
        return set.size()==hm.size();
    }
}

