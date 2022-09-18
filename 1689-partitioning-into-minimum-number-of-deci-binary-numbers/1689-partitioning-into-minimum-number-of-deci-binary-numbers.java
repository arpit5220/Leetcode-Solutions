class Solution {
    public int minPartitions(String n) {
        
        if(n.charAt(0)=='0') return 0;
      //  if(n.charAt(0)=='1') return 1;
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            int val=ch-'0';    // Or val=ch-48;
            max=Math.max(val,max);
        }
        
        return max;
    }
}