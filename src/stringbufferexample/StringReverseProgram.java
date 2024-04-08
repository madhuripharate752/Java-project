package stringbufferexample;

public class StringReverseProgram {
    public static void main(String[] args) {
        String name = "Rudransh";
        for (int i=name.length()-1; i>=0; i--) {
            System.out.print(name.charAt(i));
        }
    }
    }