package abstraction;

class Father {
    public void car(){
        System.out.println("Fther's car");
    }
}
class Son extends Father{
    public void Car(){
        System.out.println("son's car");
    }
}
 class Sample{
    public static void main(String[] args) {
        Son john = new Son();
        john.Car();
    }
}