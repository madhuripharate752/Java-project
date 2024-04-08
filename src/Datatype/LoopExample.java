package Datatype;

public class LoopExample {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print( " ");
            }
            for (int k=1; k>=7; k--) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}