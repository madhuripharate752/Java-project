package VariableExample;

public class InstanceVariableExample {
    int a= 30; //instance variable
    static int c= 20; //static variable

    public static void main(String[] args) {
        int b = 10;  //local variable
        InstanceVariableExample IV = new InstanceVariableExample();
        System.out.println(IV.a);
        System.out.println(b);
        System.out.println(c);

    }
}
