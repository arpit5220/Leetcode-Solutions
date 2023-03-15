class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        
       if(image[sr][sc]==newColor)
         return image;
         
        dfs(sr,sc,image,newColor,image[sr][sc]);
        
        return image;
    }
    
    public void dfs(int row,int col,int [] [] image,int newColor,int srcColor)
    {
     
        
        if(row<0 || col<0 || row>=image.length || col>=image[0].length || image[row][col]!=srcColor)
          return;
        
        image[row][col]=newColor;
        
        dfs(row+1,col,image,newColor,srcColor);
        dfs(row,col+1,image,newColor,srcColor);
        dfs(row-1,col,image,newColor,srcColor);
        dfs(row,col-1,image,newColor,srcColor);
    }
}