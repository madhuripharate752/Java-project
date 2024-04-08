package coolectionexample;
import java.util.Stack;
public class stackexample {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("madhuri");
        stack.push("sachin");
        stack.push("mahesh");
        stack.push("nitin");
        stack.push("10");
        stack.push("rudransh");
        stack.push("300");
        stack.push("madhuri");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.search("madhuri"));
        System.out.println(stack.search("nitin"));
        System.out.println(stack.search("rudransh"));
        System.out.println(stack.peek());
    }
}
