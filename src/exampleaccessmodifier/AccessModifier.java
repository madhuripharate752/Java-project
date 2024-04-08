package exampleaccessmodifier;

public class AccessModifier {
    public int  X = 2000;
    private int Y = 4000;
    int Z = 8000;
    public void Method1() {
      //  System.out.println(X);
        //System.out.println(Y);
        //System.out.println(Z);
    }
    public static void main(String[] args) {
        AccessModifier AC = new AccessModifier();
        System.out.println(AC.X);
        System.out.println(AC.Y);
        System.out.println(AC.Z);
    }
}
