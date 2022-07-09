class Solution {
    public boolean isOneBitCharacter(int[] bits) {
      
        boolean flag=false;
        
        for(int i=0;i<bits.length;i++)
        {
            if(i==bits.length-1)
                flag=true;
            if(bits[i]==1)
            {
                i+=1;
            }
        }
        
        return flag;
       
        
    }
}