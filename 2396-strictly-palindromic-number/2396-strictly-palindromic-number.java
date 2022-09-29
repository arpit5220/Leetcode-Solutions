class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        int count=0;
        for(int i=2;i<=n-2;i++)
        {
            int num=convert(n,i);
            if(palindrome(num)) count++;
            else
                break;
        }
        
        if(count==n-3) return true;
        else
            return false;
        
        
        
    }
    
    public static boolean palindrome(int num)
    {
        int rev=0;
        
        while(num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        
        if(num==rev)
            return true;
        else
            return false;
    }
    
    
    public static int convert(int n,int base)
    {
        
        int p=1;
        int rv=0;
        
        while(n>0)
        {
            int digit=n%base;
            n=n/base;
            
            rv+=digit*p;
            p=p*10;
        }
        
        return rv;
    }
}