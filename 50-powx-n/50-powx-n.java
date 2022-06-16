class Solution {
    public double myPow(double x, int n) {
        
        if(n==0)
            return 1;
        double xnpb2=myPow(x,n/2);
        if(n%2==0) return xnpb2*xnpb2;
        
        else if(n>0) return xnpb2*xnpb2*x;
        
        else return (xnpb2*xnpb2)/x;
       
    }
}
