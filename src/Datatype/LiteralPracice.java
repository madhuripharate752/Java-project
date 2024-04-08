package Datatype;

public class LiteralPracice {
    public static void main(String[] args) {
        //integral literal
        //1. decimal literal
        int a = 1234;
        System.out.println("decimal literal =" +a);
        // octal literal
        int b = 0700;
        System.out.println("octal literal =" + b);
        //hexadecimal literal
        int c = 0x5748;
        System.out.println("hexadecimal literal =" +c);
        //binary literal
        int d = 0b11001;
        System.out.println( "binary literal =" +d);
        //character literal
        char ch =68;
        System.out.println("character literal =" +ch);
        char ch1= 122;
        System.out.println("Ascii value of 122 is =" +ch1);
        char ch2 = 0b11;
        System.out.println("Ascii value of 0b11 = " +ch2);
        //string literal
        String s = "Madhuri";
        System.out.println("string literal =" +s);
        boolean b1 = true;
        System.out.println("boolean literal=" +b1);
    }
}
