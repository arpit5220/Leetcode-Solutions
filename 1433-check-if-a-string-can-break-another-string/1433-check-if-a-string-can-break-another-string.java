class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        while(i < s1.length() && arr1[i] >= arr2[i]){
            i++;
        }
        if(i == s1.length()){
            return true;
        }
        i = 0;
        while(i < s1.length() && arr2[i] >= arr1[i]){
            i++;
        }
        return i == s1.length();
    }
}