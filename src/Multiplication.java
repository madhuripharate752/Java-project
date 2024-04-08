public class Multiplication {
    void multiply(int a, int b, int c) {
        System.out.println(a*b*c);
    }
    void multiply(int a, int b, int c, int d) {
        System.out.println(a*b*c*d);
    }
    void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        mul.multiply(10,20);
        mul.multiply(10,20,30);
        mul.multiply(10,20,30,40);
    }
}