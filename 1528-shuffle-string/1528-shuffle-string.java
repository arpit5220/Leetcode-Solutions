class Solution {
    public String restoreString(String s, int[] indices) {
        
        
        char [] arr=new char[s.length()];
        
        for(int i=0;i<s.length();i++)
        {
            int pos=indices[i];
            char ch=s.charAt(i);
            arr[pos]=ch;
        }
        
       String str = new String(arr);
        return str;
    }
}