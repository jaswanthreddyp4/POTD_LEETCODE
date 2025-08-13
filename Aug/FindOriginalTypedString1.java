// package Aug;
public class FindOriginalTypedString1 {
    public int possibleStringCount(String word) {

        int ans=0;
        char prevChar=word.charAt(0);
        for(int i=1;i<word.length();i++){
            char currChar=word.charAt(i);
            if(currChar==prevChar){
                ans++;
            }else{
                prevChar=currChar;
            }
        }
        return ans+1;
    }
}