class Solution {
	public String[] sortPeople(String[] names, int[] height) {
		//Mapping the Names with their Respective Heights as given in question ->

		//Creation of HashMap ->
		Map<Integer,String> mp = new HashMap<>() ;

		//Height of each and every person is given to us,So doing its Mapping  ->
		for(int i=0 ; i<names.length ; i++){
			mp.put(height[i] ,names[i]) ;
		}

		//In the given question we have to return it in Descending Order ->
		Arrays.sort(height) ;

		//Creation of String to return ans ->
		String[] result = new String[height.length] ;

		int index = 0;
		for (int i = height.length - 1; i >= 0; i--) {
			result[index] = mp.get(height[i]);
			index++;
		}
		return result ;
	}

}