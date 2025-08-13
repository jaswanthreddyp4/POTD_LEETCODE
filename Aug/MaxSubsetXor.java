// package Aug;
public class MaxSubsetXor {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;

        for(int num:nums){
            maxOr=maxOr | num;
        }
        return f(0,0,maxOr,nums);
    }
    int f(int index , int currOr , int targetOr , int[] nums){
        if(index==nums.length){
            if(currOr==targetOr){
                return 1;
            }
            return 0;
        }
        int take=f(index+1, currOr|nums[index], targetOr, nums);
        int notTake=f(index+1, currOr, targetOr, nums);
        return take+notTake;
    }
    public static void main(String[] args) {
        
    }
}
