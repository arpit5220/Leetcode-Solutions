class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int b[] = score.clone();
        Arrays.sort(b);
        HashMap<Integer,String> hm=new HashMap<>();
        
        int j=1;
        for(int i=b.length-1;i>=0;i--)
        {
            if(j==1)
            {
                hm.put(b[i],"Gold Medal");
                j++;
            }
            else if(j==2)
            {
                hm.put(b[i],"Silver Medal");
                j++;
            }
            
            else if(j==3)
            {
                hm.put(b[i],"Bronze Medal");
                j++;
            }
            
            else
            {
                hm.put(b[i],""+j);
                j++;
            }
        }
        
        String [] str=new String[b.length];
        for(int i=0;i<score.length;i++)
        {
            str[i]=hm.get(score[i]);
        }
        
        return str;
        
    }
}