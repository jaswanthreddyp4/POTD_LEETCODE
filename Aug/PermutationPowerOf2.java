// package Aug;
public class PermutationPowerOf2 {
    //so basically we have powers of 2 from 2^0 to 2^31
    //for all these numbers frequency of each digit and n should be same
    public int[] frequencyOfNum(int num){
        int[] freq = new int[10];
        while(num!=0){
            freq[num%10]++;
            num=num/10;
        }
        return freq;
    }
    public boolean isFreqEqual(int[] nums1,int[] nums2){
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=nums2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean reorderedPowerOf2(int n) {
    for(int i=0;i<32;i++){
        int powOf2=(int)Math.pow(2,i);
        if(isFreqEqual(frequencyOfNum(powOf2),frequencyOfNum(n))){
            return true;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        
    }
}
