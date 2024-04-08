package Datatype;

public class Identifier {
    public static void main(String[] args) {
        int SALARY = 3456;   // valid identifier
        int salary =4567;    // valid identifier
     // int 09marks = 3456      invalid identifier
        int marks09 = 90;    //valid identifier
        int madhuri_mane = 98; //valid identifier
        int madhuri$salary = 50000; // valid identifier
        //  int sona mane = 809; invalid identifier
        int sonamane = 809; // valid identifier

        System.out.println(SALARY);
        System.out.println(salary);
        System.out.println(marks09);
        System.out.println(madhuri_mane);
        System.out.println(madhuri$salary);
        System.out.println(sonamane);
        System.out.println(100/5);
    }
}
