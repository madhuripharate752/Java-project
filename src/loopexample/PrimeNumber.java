package loopexample;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number =sc.nextInt();
        int check = 0;
        for(int i=1; i<=number; i++) {
            if (number % i == 0) {
                check++;
            }
        }
        if (check ==2){
            System.out.println("Number is Prime");
            }else{
            System.out.println("Number is not Prime");
        }

    }
}
