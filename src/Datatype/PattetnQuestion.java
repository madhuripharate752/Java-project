package Datatype;

public class PattetnQuestion {
    public static void main(String[] args) {
         for(int i=1; i<=7; i++){
             //for star
             for(int j=7; j>=i; j--){
                 System.out.print("*" + " ");
             }
             //for space
             for(int j=1; j<=i; j++){
                 System.out.print(" ");
             }
             System.out.println();

        }
    }
}
