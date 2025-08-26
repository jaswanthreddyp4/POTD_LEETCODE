public class MaxAreaOfRectangleInWhichAllOnesAreIncluded {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int maxRow=-1;
        int minRow=m;
        int maxColumn=-1;
        int minColumn=n;

        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1){
                    minColumn=Math.min(minColumn,col);
                    maxColumn=Math.max(maxColumn,col);
                    minRow=Math.min(minRow,row);
                    maxRow=Math.max(maxRow,row);
                }
        }
        }
        return (maxRow-minRow+1)*(maxColumn-minColumn+1);
    }
    public static void main(String[] args) {
        
    }
}
