class Solution {
    public int minFlips(String target) {
        int count=0;
        char curr = '0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=curr){
                count++;
                curr=target.charAt(i);
            }
        }
        return count;
    }
}