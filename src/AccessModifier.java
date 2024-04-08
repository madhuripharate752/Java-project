public class AccessModifier {
    public int X = 1000;
    protected int Y = 2000;
    private int Z= 3000;
    private int C = 6000;
    int A = 4000;
    int B = 5000;
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        System.out.println(am.X);
        System.out.println(am.Y);
        System.out.println(am.Z);
        System.out.println(am.A);
        System.out.println(am.B);
    }
}
