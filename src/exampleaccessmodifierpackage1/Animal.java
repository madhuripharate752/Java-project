package exampleaccessmodifierpackage1;

public class Animal {
    protected void dog(){
        System.out.println("Rocky");
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.dog();
    }
}
