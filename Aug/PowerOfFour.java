public class PowerOfFour {
    // 4  = 00000100
    // 16 = 00010000
    // 64 = 01000000
    //for i=2;i<32 i+=2 only that bit should be set else every bit shld be zero
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        for(int i=0;i<32;i+=2){
            //is only ith bit is 1 then n & (1<<i)==n
            if((n&(1<<i))==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
