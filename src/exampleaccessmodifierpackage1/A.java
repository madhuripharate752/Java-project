package exampleaccessmodifierpackage1;

public class A {
    protected void protectedmodifier(){
        System.out.println("this is protected modifier");
    }
       }
        class B extends A{}
        class C extends B{}
class main{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.protectedmodifier();
        C obj2 = new C();
        obj2.protectedmodifier();
    }
}
