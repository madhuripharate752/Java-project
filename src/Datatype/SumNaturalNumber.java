package Datatype;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 100; i++) {
            number = number + 1;
        }
        System.out.println("Sum of natural number is:" + number);
    }
}