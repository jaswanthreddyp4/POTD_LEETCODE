
import java.util.Arrays;

public class CountSubMatricesWithOnes {
    int countSubArrays(int[] nums){
        //1 0 1 1 1

        int consecOnesSum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                consecOnesSum++;
            }else{
                res+=((consecOnesSum*(consecOnesSum+1))/2);
                consecOnesSum=0;
            }
        }
        return res;
    }
    public int numSubmat(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        // 1 1 1
        // 1 1 1
        // 1 0 1

        int res=0;

        for(int startRow=0;startRow<m;startRow++){
            int[] andVector=new int[n];
            Arrays.fill(andVector, 1);
            for(int endRow=0;endRow<m;endRow++){
                for(int col=0;col<n;col++){
                    andVector[col]=andVector[col]&mat[endRow][col];
                }
                res+=countSubArrays(andVector);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}