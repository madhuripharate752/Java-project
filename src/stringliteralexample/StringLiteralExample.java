package stringliteralexample;

public class StringLiteralExample {
    public static void main(String[] args) {
        String name1 = "madhuri";
        String name2 = "madhuri";
        String name3 = " madhuri pharate";
        String name = new String("Sachin");
        System.out.println(name1==name);
        System.out.println(name1==name2);
        System.out.println(name1.equals(name));
        System.out.println(name1.equals(name2));
        System.out.println(name1.concat(name));
        System.out.println(name1.compareTo(name2));
    }
}
