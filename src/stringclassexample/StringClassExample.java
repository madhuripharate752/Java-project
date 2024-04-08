package stringclassexample;

import java.util.Locale;

public class StringClassExample {
    public static void main(String[] args) {
        String name1 = "       madhuri pharate    ";
        String name2 = "    SACHIN PHARATE  ";
        System.out.println(name1);
        System.out.println(name1.trim());
        System.out.println(name2);
        System.out.println(name2.trim());
        System.out.println(name1.charAt(8));
        System.out.println(name2.toLowerCase());
        System.out.println(name1.toUpperCase());
    }
}
