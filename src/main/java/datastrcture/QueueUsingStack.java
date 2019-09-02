package datastrcture;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        Stack stack;
        Stack tempStack;
    }

    public static void enqueue(int value, Queue queue) {
        queue.stack.push(value);
    }

    public static Object dequeue(Queue queue) {

        if (queue.stack.empty() && queue.tempStack.empty()) {
            System.out.println("queue is empty");
            System.exit(1);
        }
        if (queue.tempStack.isEmpty()) {
            while (!queue.stack.isEmpty()) {
                queue.tempStack.push(queue.stack.pop());
            }
        }
        return queue.tempStack.pop();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.stack = new Stack();
        queue.tempStack = new Stack();

        enqueue(4, queue);
        enqueue(3, queue);
        enqueue(2, queue);

        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
        System.out.println(dequeue(queue));
        enqueue(1, queue);
        System.out.println(dequeue(queue));


    }
}

