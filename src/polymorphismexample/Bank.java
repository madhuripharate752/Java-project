package polymorphismexample;
public class Bank {
        float Interest(){
            return 0;
        }
    }
    class SBI extends Bank{
        float Interest(){
            return 8.4f;
        }
    }
    class ICICI extends Bank{
        float Interest(){
            return 7.3f;
        }
    }
    class TestPolymorphism{
        public static void main(String args[]){
            Bank b = new SBI ();
            System.out.println("SBI Rate of Interest: "+b.Interest());
           Bank b1 = new ICICI();
            System.out.println("ICICI Rate of Interest: "+b1.Interest());
    }
}
