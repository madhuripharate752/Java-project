package Method;

public class MethodExample {
    public static void method1(){
        System.out.println("this is static method");

    }
    public void method2(){
        System.out.println("this normal method");
    }

    public static void main(String[] args) {
        MethodExample ME = new MethodExample();
        ME.method2();
        method1();

    }
}
