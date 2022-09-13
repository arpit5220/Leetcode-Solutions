class Solution {
    public List<String> simplifiedFractions(int n) {
        
        ArrayList<String> strr=new ArrayList<String>();
        HashSet set = new HashSet<>();
        for(int i=1;i<n;i++)
        {
            for(int j=2;j<=n;j++)
            {
                double val=(double)i/j;
               if(val>0 && val<1 && !set.contains(val)){
                strr.add(i+"/"+j);
                   set.add(val);
                }   
            }
        }
        
        return strr;  
    }
}


