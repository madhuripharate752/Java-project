package upcasting;
public class Parent {
        String name;
        void showMessage(){
            System.out.println("Parent");
        }}
    class Child extends Parent {
        int age;
        @Override
        void showMessage(){
            System.out.println("Child");
        }}
    class Downcasting {
        public static void main(String[] args) {
            Parent p = new Child();
            p.name = "madhuri";
            Child c = (Child)p;
            c.age = 18;
            System.out.println(c.name);
            System.out.println(c.age);
            c.showMessage();
        }
    }




