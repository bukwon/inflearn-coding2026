
import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('(');

        if (stack.pop() == '(') {
            System.out.println(true);
        } 
    }
}
