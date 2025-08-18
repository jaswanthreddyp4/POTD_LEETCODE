public class MaxExachange9 {
    //9669
    //9699
    //9969
    // from right change 1st 6 to 9 is no 6 then chill , return
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        String changedNum="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='6' && count<1){
                changedNum=s.replace('6', '9');
                count++;
            }
        }
        return Integer.parseInt(changedNum);
    }
    public static void main(String[] args) {
        
    }
}
