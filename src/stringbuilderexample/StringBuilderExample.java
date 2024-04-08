package stringbuilderexample;

public class StringBuilderExample {
    public static void main(String[] args) {
        String name = "madhuri pharate";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.append("pvt. ltd"));
        System.out.println(sb.insert(8, "Rudransh"));
        System.out.println(sb.replace(0,7,"sachin"));
        System.out.println(sb.delete(1,7));
        System.out.println(sb.reverse());


    }
}
