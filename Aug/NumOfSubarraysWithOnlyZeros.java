public class NumOfSubarraysWithOnlyZeros {
    //[1,3,0,0,2,0,0,4]
    //for every zero go till end zero 
    //for this length say n , subarrays will be (n*(n+1))/2
    //add these nums
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long ans=0;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                int j=i;
                while(j<n && nums[j]==0){
                    j++;
                }
                int len=j-i;
                ans+=(len*(len+1))/2;
                i=j;
            }else{
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
