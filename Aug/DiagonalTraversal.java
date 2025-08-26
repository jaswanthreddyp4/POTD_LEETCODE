public class DiagonalTraversal {

    public int[] findDiagonalOrder(int[][] mat) {

        if (mat == null || mat.length == 0) {
        return new int[0];
    }
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];

        int r=0;
        int c=0;

        for(int i=0;i<result.length;i++){

            result[i]=mat[r][c];

            if((r+c)%2==0){//we need to go up
                if(c==n-1){
                    r++;
                }else if (r==0) {
                    c++;
                }else{
                    r--;
                    c++;
                }
            }else{//we need to go down
                if(r==m-1){
                    c++;
                }else if(c==0){
                    r++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return result;
         
    }
    public static void main(String[] args) {
        
    }
}
