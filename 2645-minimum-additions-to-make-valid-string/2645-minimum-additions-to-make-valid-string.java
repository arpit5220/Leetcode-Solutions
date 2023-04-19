class Solution {
    public int addMinimum(String word) {
        
        if(word.length()==1)
            return 2;
        
        int count=0;
        int size=word.length()-1;
        char ch2=word.charAt(0);
        
        if(ch2=='b')
            count+=1;
        else if(ch2=='c')
            count=count+2;
        
        for(int i=0;i<word.length()-1;i++)
        {
            char ch=word.charAt(i);
            char ch1=word.charAt(i+1);
            
            if(i<size && ch=='a' && ch1=='c')
                count++;
            
            else if(i<size && ch=='a' && ch1=='a')
                count=count+2;
            else if(i<size && ch=='b' && ch1=='b')
                count=count+2;
            else if(i<size && ch=='b' && ch1=='a')
                count=count+1;
            else if(i<size && ch=='c' && ch1=='c')
                count=count+2;
            else if(i<size && ch=='c' && ch1=='b')
                count=count+1;      
        }
        
        if(word.charAt(size)=='a')
            count=count+2;
        if(word.charAt(size)=='b')
            count=count+1;
        
        return count;
    }
}