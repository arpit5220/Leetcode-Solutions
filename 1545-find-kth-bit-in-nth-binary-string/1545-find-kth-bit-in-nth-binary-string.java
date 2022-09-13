class Solution {
    public char findKthBit(int n, int k) {
        String str = "0";
        for(int i=0;i<n-1;i++){
            String temp = str;
            temp = temp.replace("1","*");
            temp = temp.replace("0","1");
            temp = temp.replace("*","0");
            StringBuilder sb = new StringBuilder(temp);
            str=str+"1"+sb.reverse().toString();
            //System.out.print(str+" ");
        }
       // System.out.println();
        return str.charAt(k-1);
    }
}