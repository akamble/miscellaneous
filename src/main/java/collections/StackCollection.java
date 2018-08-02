package collections;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack();
        stack.push(1);
        stack.push("string");
        System.out.println(stack.peek());
        System.out.println(stack.get(stack.size() - 2));
    }
}
