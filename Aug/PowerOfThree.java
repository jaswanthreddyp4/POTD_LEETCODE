// package Aug;
public class PowerOfThree {
    //3^0=1
    //3^1=3
    //3^2=9
    //3^3=27
    //3^4=81

    //81/3 = 27/3 = 9/3 = 3/3 = 1
    //start dividing n by 3 untill it becomes 1 if yes true else false
    public boolean isPowerOfThree(int n) {
       if(n<=0){
            return false;
        }
          while(n!=1 && (n%3==0)){
            n=n/3;
        }
        return n==1;
    }
    public boolean isPowerOfThreeOpt(int n){
        if(n<=0)return false;
        return 1162261467%n==0;
    }
    public static void main(String[] args) {
        
    }
}
