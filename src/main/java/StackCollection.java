import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(3);
        stack.push(2);
        stack.push(1);

        while(!stack.empty())
            System.out.println(stack.pop());
    }
}
