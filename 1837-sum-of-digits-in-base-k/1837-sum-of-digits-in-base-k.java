class Solution {
    public int sumBase(int n, int k) {
        
        int p=n,sum=0;
        if(k==10)
        {
            //int p=n,sum=0;
            while(p!=0)
            {
                sum+=p%10;
                p=p/10;
            }
            return sum;
        }
        
        
        
        else
        {
            int mul=1;
            int num=0;
            while(p!=0)
            {
                int rem=p%k;
                p=p/k;
                
                
                num=num+rem*mul;
                mul=mul*10;
                
            }
            
            int res=num;
            while(res!=0)
            {
                sum+=res%10;
                res=res/10;
            }
            
        }
        
        return sum;
        
        
    }
}