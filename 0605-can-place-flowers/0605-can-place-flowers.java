class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(n==0)
            return true;
        
       if(flowerbed.length==1 && flowerbed[0]==0 && n==1)
            return true;
       
        if(flowerbed.length==1 && flowerbed[0]==1 && n==2)
            return false;
                
            
            
         int size=flowerbed.length;   
         int num=n;
        
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i==0)  // first
                {
                    if(flowerbed[i+1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                        if(n<=0)
                            break;
                    } 
                    
                    if(n<=0)
                        break;
                    
                }
                
                else if(i==flowerbed.length-1)  // last
                {
                    if(flowerbed[i-1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                        if(n<=0)
                            break;
                    }
                    if(n<=0)
                        break;
                }
                
                else if(flowerbed[i+1]==0 && flowerbed[i-1]==0)
                {
                    flowerbed[i]=1;
                    n--;
                    if(n<=0)
                        break;
                }
                if(n<=0)
                    break;
                           
            }
                
        }
        
        return n==0;
    }
}