class Solution {
    public List<String> commonChars(String[] words) {
        
        int [] frq=new int [26];
        Arrays.fill(frq,1000);
        
        
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            int [] arr=new int[26];
            
            for(int j=0;j<str.length();j++)
            {
                arr[str.charAt(j)-'a']++;
            }
            
            for(int k=0;k<26;k++)
            {
                frq[k]=Math.min(arr[k],frq[k]);
            }
        }
        
        List<String> res=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(frq[i]>0)
            {
                res.add(""+(char)(i+'a'));
                frq[i]--;
            }
        }
        
        return res;
    }
}