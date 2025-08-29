import java.util.*;
public class SortDiagonal {
    /*
     
    1   2   3   4
    4   5   6   5  
    7   8   9   6
    7   6   5   4
     



     */

    int[][] sortDiagonal(int row,int col,int[][] res,int[][] grid){
        int n=grid.length;
        int i=row;
        int j=col;
        List<Integer> list=new ArrayList<>();
        while(i<n &&j<n){
            list.add(grid[i][j]);
            i++;
            j++;
        }
        if(i<=j){
            Collections.sort(list,(a,b)->b-a);
        }else{
            Collections.sort(list);
        }
        i=row;
        j=col;
        for(int k=0;k<list.size();k++){
            res[i][j]=list.get(k);
            i++;
            j++;
        }
        return res;
    }
    public int[][] sortMatrixNotSoOptimal(int[][] grid) {
        int n=grid.length;

        int[][] res=new int[n][n];
        //1st do for lower diagonal
        for(int row=0;row<n;row++){
            sortDiagonal(row,0,res,grid);
        }
        for(int col=1;col<n;col++){
            sortDiagonal(0,col,res,grid);
        }
        return res;
    }

    public int[][] sortMatrix(int[][] grid){
        int n=grid.length;
        int[][] res=new int[n][n];
        
        Map<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int d=i-j;
                if(d>=0){
                    map.putIfAbsent(d,new PriorityQueue<>());
                }else{
                    map.putIfAbsent(d,new PriorityQueue<>(Collections.reverseOrder()));
                }
                map.get(d).offer(grid[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int d=i-j;
                res[i][j]=map.get(d).poll();
            }
        }
        return res;


    }

    public static void main(String[] args) {
        
    }
}
