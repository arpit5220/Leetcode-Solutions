class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r=BinarySearchRow(matrix,target);
        
        if(r==-1)
            return false;
        
        boolean find=BinarySearch(matrix,r,target);
        
        return find;
    }
    
    // To search target in a row
    public static boolean BinarySearch(int matrix[][],int r,int target)
    {
        int low=0;
        int high=matrix[r].length-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(matrix[r][mid]==target)
            {
                return true;
            }
            else if(matrix[r][mid]>target)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        
        return false;
    }
    
    // to search a row which contain a target
    public static int BinarySearchRow(int matrix[][],int target)
    {
        int low=0;
        int high=matrix.length-1;
        int j=matrix[0].length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(matrix[mid][0]<=target && matrix[mid][j]>=target)
            {
                return mid;
                
            }
            
            else if(matrix[mid][0]>target)
            {
                high=mid-1;
            }
            
            else
                low=mid+1;
        }
        
        return -1;
    }
}