package exampleexceptionhandling;

public class ExceptionHandlingExample {
        public static void main(String args[]){
            System.out.println("Exception Handling 1");
            try{
                int data=100/0;
            }catch(ArithmeticException a){
                System.out.println(a);}
            System.out.println("Exception Handling 2");
        }
    }

