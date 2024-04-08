package linkedexample;
import java.util.LinkedList;
public class LInkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("madhuri");
        linkedlist.add("manavi");
        linkedlist.add("monali");
        linkedlist.add("minakshi");
        linkedlist.add("maira");
        linkedlist.add("maya");
        linkedlist.add("mona");
        linkedlist.add("mira");
        for (String s : linkedlist) {
            System.out.println(s);
        }
    }
}
