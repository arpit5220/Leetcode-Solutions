class Solution {
    public int beautySum(String s) {
        int a = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] ar=new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++) {
                ar[s.charAt(j)-'a']++;
                for(int k = 0 ; k < 26 ; k++){ 
                  max=Math.max(max,ar[k]);
                 if(ar[k]!=0) min=Math.min(min,ar[k]);
                 }
                a+=max-min;
                max=Integer.MIN_VALUE;
                min=Integer.MAX_VALUE;
              }
            Arrays.fill(ar,0);
        }
        return a;
    }
}