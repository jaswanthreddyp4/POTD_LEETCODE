public class MaxSubarrayLenAfterDelAtmostOneElement {
    public int longestSubarray(int[] nums) {
        int n=nums.length;

        int maxLength=0;
        int zeroCount=0;

        int i=0;
        int j=0;

        while(j<n){
            if(nums[j]==0){
                zeroCount++;
            }

            while(zeroCount>1){
                if(nums[i]==0){
                    zeroCount--;
                }
                i++;
            }

            maxLength=Math.max(maxLength,j-i);
            j++;
        }
        return maxLength;
    }

    public int longestSubarray1(int[] nums) {
        int n=nums.length;

        int maxLength=0;
        int zeroCount=0;
        int lastSeenZerIndex=-1;

        int i=0;
        int j=0;

        while(j<n){
            
        }
        
    }
    public static void main(String[] args) {
        
    }
}
