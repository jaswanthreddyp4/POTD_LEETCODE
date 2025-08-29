public class AliceBobPlayingFlowerGame {
    /*

    there are x flowers in 1 lane 
    y flowers in another lane

    total flowers = x+y

    if even flowes say 4 , since aloce always starts first , picking order will be 
    A , B , A , B - when B picks last flower since flowers are empty B will win

    if odd flowers say 5 , since aloce always starts first , picking order will be
    A , B , A , B , A - when A picks last flower since flowers are empty A will win

    so total flowes should be fine 

    in given range 1-m and 1-n we need to find number of pairs whose sum is odd

    case 1 : x is odd and y is even 

    1 2 3 4 5   - n
    1 2 3 4     - m

    for odd number even should be paired , for even number odd number should be paired
    (n/2+1)odd numbers are mapped with (m/2) even numbers
    (n/2)even numbers are mapped with (m/2+1) odd numbers

    number of pairs= (n/2+1)*(m/2) + (n/2)*(m/2+1)
    which is approximately n*m/2

    case 2 : x is even and y is odd

    1 2 3 4   - n
    1 2 3 4 5 - m

    for odd number even should be paired , for even number odd number should be paired
    (n/2)odd numbers are mapped with (m/2+1) even numbers
    (n/2+1)even numbers are mapped with (m/2) odd numbers   

    number of pairs= (n/2)*(m/2+1) + (n/2+1)*(m/2)
    which is approximately n*m/2

    case 3 : x is odd and y is odd

    1 2 3 4 5   -  n
    1 2 3 4 5   -  m

    for odd number even should be paired , for even number odd number should be paired
    (n/2+1)odd numbers are mapped with (m/2) even numbers
    (n/2)even numbers are mapped with (m/2+1) odd numbers  

    number of pairs= (n/2+1)*(m/2) + (n/2)*(m/2+1)
    which is approximately n*m/2

    case 4 : x is even and y is even

    this is staright forward m*n/2

    so final answer is m*n/2

     */
    public long flowerGame(int n, int m) {
        return (long)n*m/2;

        
    }
    public static void main(String[] args) {
        
    }    
}
