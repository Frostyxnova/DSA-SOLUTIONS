class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
    long a1=(ax2-ax1)*(ay2-ay1);
        long a2=(bx2-bx1)*(by2-by1);

        int tx=Math.min(bx2,ax2)-Math.max(bx1,ax1);
        int ty=Math.min(by2,ay2)-Math.max(by1,ay1);
        long ac=0; 
        if(tx>0 && ty>0){
            ac=tx*ty;
        }
        return (int)(a1+a2-ac);    
    }
}