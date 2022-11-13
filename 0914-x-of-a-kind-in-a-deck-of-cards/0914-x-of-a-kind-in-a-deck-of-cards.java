class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        if(deck.length==1) return false;
        for(int i=0;i<deck.length;i++)
        {
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        }
        
        int counter=0;
        int gcd=1;
        for(int val:hm.keySet())
        {
            
            if(counter==0)
            {
                gcd=hm.get(val);
            }
            else
            {
                gcd=getGcd(gcd,hm.get(val));
            }
            counter++;
        }
        
        return gcd>=2;   
    }
    
    public static int getGcd(int n1,int n2)
    {
        if(n1>n2)
        {
            int temp=n1;
            n1=n2;
            n2=temp;
        }
        
        for(int i=n1;i>=0;i--)
        {
            if(n1%i==0 && n2%i==0)
                return i;
        }
        return 0;
    }
}