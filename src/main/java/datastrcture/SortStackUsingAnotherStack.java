package datastrcture;

import java.util.Stack;

public class SortStackUsingAnotherStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        System.out.println("before sort");
        System.out.println(stack);

        Stack<Integer> tempStack = new Stack();

        while (!stack.isEmpty()) {
            int topOfStack = stack.pop();
            if (!tempStack.isEmpty() && tempStack.peek() > topOfStack){
                stack.push(tempStack.pop());
            }
            tempStack.push(topOfStack);
        }
        System.out.println("after sort");
        System.out.println(stack);
    }
}
