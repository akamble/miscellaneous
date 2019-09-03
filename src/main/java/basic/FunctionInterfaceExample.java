package basic;

//    A functional interface is an interface that contains only one abstract method but it can have multiple default methods.
//    e.g. Runnable, Comparable are some of the examples of functional interfaces.


interface ThreadInterface{

    void show();
}

public class FunctionInterfaceExample {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("ssad")).start();

    }

}
