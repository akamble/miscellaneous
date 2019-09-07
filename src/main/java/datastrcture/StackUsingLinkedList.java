package datastrcture;

public class StackUsingLinkedList {
    Node head;


    private class Node {
        int value;
        Node next;
    }

    public StackUsingLinkedList() {
        head = null;
    }

    public void pop() {
        if (head == null){
            System.out.println("stack is empty");
        }
      else {
            int value = head.value;
            head = head.next;
            System.out.println("removed number"+ value);
        }
    }

    public void push(int value) {
       Node oldNode = head;
       head = new Node();
       head.value = value;
       head.next = oldNode;
       System.out.println("added numbed" + head.value);
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(12);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.pop();
    }
}
