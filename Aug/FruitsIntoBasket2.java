// package Aug;
public class FruitsIntoBasket2 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int ans=n;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i]<=baskets[j]){
                    ans--;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
