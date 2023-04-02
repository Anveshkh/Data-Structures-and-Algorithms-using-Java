package Stack;

import java.util.Stack;

public class InBuiltStackEg {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(28);
        stack.push(2);
        stack.push(8);
        stack.push(5);
        stack.push(64);
        stack.push(209);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
