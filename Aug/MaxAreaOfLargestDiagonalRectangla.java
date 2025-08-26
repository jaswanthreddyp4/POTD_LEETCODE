
// class DiagonalIndex{
//     int diagonalLength;
//     int index;
//     DiagonalIndex(int diagonalLength,int index){
//         this.diagonalLength=diagonalLength;
//         this.index=index;
//     } 
// }

public class MaxAreaOfLargestDiagonalRectangla {

    public int areaOfMaxDiagonal(int[][] dimensions) {
        //we need to find return area of rectangle with max diagonal length 
        //for this we need to have track of diagonal length ,index object
        int maxArea=-1;
        int maxDiagonalLength=-1;
        for(int[] rect:dimensions){
            int length=rect[0];
            int breadth=rect[1];
            
            int squaredDiagonal=length*length+breadth*breadth;
            if(squaredDiagonal>maxDiagonalLength){
                maxDiagonalLength=squaredDiagonal;
                maxArea=length*breadth;
            }else if(squaredDiagonal==maxDiagonalLength){
                int area=length*breadth;
                if(area>maxArea){
                    maxArea=area;
                }
            }
    }
    return maxArea;
}
    public static void main(String[] args) {
        
    }
}
