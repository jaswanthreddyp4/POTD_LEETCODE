// package Aug;
public class MaximumLengthOfValidSubseq1 {

    public int maximumLength(int[] nums) {

        int n=nums.length;
        int evenCount=0;
        int oddCount=0;
        int alternateParityCount=1;
        for(int num:nums){
            if((num&1)==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        int prevParity=nums[0]%2;
        for(int i=1;i<n;i++){
            int currentParity=(nums[i]&1);
            if(currentParity!=prevParity){
                alternateParityCount++;
                prevParity=currentParity;
            }
        }
        return Math.max(evenCount,Math.max(alternateParityCount, oddCount));
    }
    public static void main(String[] args) {
        
    }
}
