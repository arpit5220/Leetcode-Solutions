class Solution {
    public int numberOfBeams(String[] bank) {
        
        int prev=0,beams=0;
        for(int i=0;i<bank.length;i++)
        {
            int one=0,zero=0;
            for(int j=0;j<bank[i].length();j++)
            {
                char ch=bank[i].charAt(j);
                if(ch=='0')
                    zero++;
                if(ch=='1')
                    one++;
            }
            
            if(i>0 && one!=0)
            {
                beams+=(one*prev);
                prev=one;
            }
            
            if(one!=0)
             prev=one;
        }
        
        return beams;
    }
}