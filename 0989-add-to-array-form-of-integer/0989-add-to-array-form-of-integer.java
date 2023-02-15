class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        int len=num.length-1;
        int carry=0;
        
        while(len>=0 || carry>0 || k>0)
        {
            int a=0;
            if(len>=0)
            {
                a=num[len];
                len--;
            }
            
            int b=0;
            if(k>0)
            {
                 b=k%10;
                k=k/10;
            }
            
            int n=(a+b+carry)%10;
            carry=(a+b+carry)/10;
            
            list.add(0,n);
        }
        
        return list;
    }
}