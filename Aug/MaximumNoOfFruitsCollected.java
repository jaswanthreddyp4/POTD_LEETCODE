// package Aug;
public class MaximumNoOfFruitsCollected {
    //kid 1 can move onky in diagonal , since its said at max any kid can take only n-1 steps
    //for kid 1 no need of recursion add diagonal elements 
    public int maxCollectedFruits(int[][] fruits) {
        int n=fruits.length;
        
        int count1=0;
        for(int i=0;i<n;i++){
                count1+=fruits[i][i];
            }
        int count2=f1(0,n-1,fruits);
        int count3=f2(n-1,0,fruits);
        return count1+count2+count3;
    }
    int f1(int i,int j,int[][] fruits){
        if(i>=fruits.length||j<0||j>=fruits.length){
            return 0;
        }
        if(i==fruits.length-1 && j==fruits.length-1){
            return 0;
        }
        if(i>j||i==j){
            return 0;
        }
        int bottomLeft=fruits[i][j]+f1(i+1, j-1, fruits);
        int bottom=fruits[i][j]+f1(i+1, j, fruits);
        int bottomRight=fruits[i][j]+f1(i+1, j+1, fruits);
        return Math.max(bottomLeft, Math.max(bottom, bottomRight));
    }
    int f2(int i,int j,int[][] fruits){
        if(j>=fruits.length||i<0||i>=fruits.length){
            return 0;
        }
        if(i==fruits.length-1 && j==fruits.length-1){
            return 0;
        }
        if(i<j||i==j){
            return 0;
        }
        int upRight=fruits[i][j]+f2(i-1, j+1, fruits);
        int right=fruits[i][j]+f2(i, j+1, fruits);
        int bottomRight=fruits[i][j]+f2(i+1, j+1, fruits);
        return Math.max(upRight, Math.max(right, bottomRight));
    }
    
    
    public static void main(String[] args) {
        
    }
}
