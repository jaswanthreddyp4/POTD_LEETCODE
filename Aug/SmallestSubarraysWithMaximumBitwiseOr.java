// package Aug;

import java.util.*;

public class SmallestSubarraysWithMaximumBitwiseOr {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;

        int[] result = new int[n];
        int[] setBitIndex = new int[32];
        Arrays.fill(setBitIndex, -1);

        //to set the b'th bit of nums[i] we need to go to least index j(j>i) such that b'th bit of nums[j] is set
        for(int i=n-1;i>=0;i--){
            int endIndex=i;
            for(int bit =0;bit<32;bit++){
                //if its already set
                if((nums[i] & (1<<bit))==0){
                    if(setBitIndex[bit]!=-1){
                        endIndex=Math.max(setBitIndex[bit], endIndex);
                    }
                }else{
                    setBitIndex[bit]=i;
                }
            }
            result[i]=endIndex-i+1;
        }
        return result;
    }
       public static void main(String[] args) {
        
    }
}
