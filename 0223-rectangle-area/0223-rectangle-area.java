class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //for rectangle 1
        int area1 = (ax2 - ax1)*(ay2 - ay1);
        
        //for rectangle 2
        int area2 = (bx2 - bx1)*(by2 - by1);
        
        //for intersecting rectangle
        int x3 = Math.max(ax1, bx1);
        int y3 = Math.max(ay1, by1);
        int x4 = Math.min(ax2, bx2);
        int y4 = Math.min(ay2, by2);

        int x = x4 - x3;
        int y = y4 - y3;
        //area of intersecting rectangle
        int commonArea = x * y;
        
        if( x < 0 || y < 0 ){     //means both rectangle do not intersect
            commonArea = 0;
        }
        
        int totalArea = area1 + area2 - commonArea;
        return totalArea;
        
    }
}