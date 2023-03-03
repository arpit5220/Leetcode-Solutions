class Solution {
    public int compress(char[] chars) {
        
        int i=0;
        int index=0;
        while(i<chars.length)
        {
            int j=i;
            
            while(j<chars.length && chars[i]==chars[j])  //  --> this loops are important 
            {
              j++;  
            }
        
                   chars[index++]=chars[i];
            
                  if(j-i>1){
                   String count=j-i+""; 
                   for(char c: count.toCharArray())
                       chars[index++]=c;
                  }
                      
                
                i=j;   
                
            }
        
              return index;
        }    
        
    }
