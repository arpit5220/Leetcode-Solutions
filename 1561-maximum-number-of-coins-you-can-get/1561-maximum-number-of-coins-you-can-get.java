class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int count=0;
        int n=piles.length;
        for(int i=piles.length-1;i>=n/3;i--)
        {
            if(n%2==0 && i%2==0)
            {
                count+=piles[i];
            }
            else if(n%2!=0 && i%2!=0)
            {
                  count+=piles[i];
            }
        }
        
        return count;
        
    
    }
}