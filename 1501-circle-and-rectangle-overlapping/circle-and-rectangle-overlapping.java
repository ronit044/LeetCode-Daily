class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int close_Xaxis = Math.max(x1,Math.min(x2,xCenter));
        int close_Yaxis = Math.max(y1,Math.min(y2,yCenter));

        int distanceX = xCenter - close_Xaxis;
        int distanceY = yCenter - close_Yaxis;
        if(distanceX * distanceX + distanceY*distanceY <= radius*radius){
            return true;
        }
        return false;
    }
}