
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       ///// o(n) Time Solution
        int l=-1,temp=0;
        for(int i=arr.length-1;i>=0;i--){
            temp=arr[i];
            arr[i]=l;
            l=Math.max(l,temp);
        }
        
        return arr;
