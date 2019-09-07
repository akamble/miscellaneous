package datastrcture;

public class StackUsingArray {

    private int size;
    private int[] arrayInt;
    private int top;

    StackUsingArray(int size) {
        this.size = size;
        this.arrayInt = new int[size];
        this.top = -1;
    }

    public void pop() {
        if (arrayInt.length == 0)
            System.out.println("Stack is empty");
        else
        {
            int tempTop = top;
            top --;
            System.out.println("removed number"+ arrayInt[tempTop]);
        }

    }

    public void push (int number) {
        if (top == (size -1))
            System.out.println("stack is full");
        else
        {
            top++;
            arrayInt[top] = number;
            System.out.println("added number "+ number);

        }
    }

    public void peek(){

        if (top == (size - 1))
            System.out.println("stack is full");
        else
            System.out.println("top number "+ arrayInt[top]);

    }

    public static void main(String[] args) {

        StackUsingArray array = new StackUsingArray(2);

        array.push(1);
        array.push(3);
        array.pop();
        array.pop();
        array.push(2);
        array.peek();

    }
}
