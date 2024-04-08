package loopexample;

public class NaturalNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversenumber = 0;
        while(number != 0) {
            int lastdigit = number % 10;
            reversenumber = reversenumber * 10 + lastdigit;
            number = number / 10;
        }
            System.out.println("Reverse of given number is:" + reversenumber);
        }
    }

