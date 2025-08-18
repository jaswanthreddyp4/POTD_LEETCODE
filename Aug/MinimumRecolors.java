public class MinimumRecolors {
    //WBBWWBBWBW
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int whiteCount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whiteCount++;
            }
        }
        int operations=whiteCount;
        for(int i=k;k<n;k++){
            if(blocks.charAt(i)=='W'){
                whiteCount++;
            }
            if(blocks.charAt(k-i)=='W'){
                whiteCount--;
            }
            operations=Math.min(operations, whiteCount);
        }
        return operations;
    }
    public static void main(String[] args) {
        
    }
}
