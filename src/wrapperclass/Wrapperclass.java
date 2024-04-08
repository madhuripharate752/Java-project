package wrapperclass;

public class Wrapperclass {
    public static void main(String[] args) {
        int i=100;  //primitive data type
        Integer integer = i; //Autoboxing
        System.out.println(integer);
        int x = integer;   //unboxing
        System.out.println(x);
    }
}
