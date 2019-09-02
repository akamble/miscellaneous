package designpattern;

public class SingletonPreventThreading {

    private static SingletonPreventThreading singleton;

    private SingletonPreventThreading(){

    }

    public static synchronized SingletonPreventThreading getInstance() {

        if (singleton == null) {
            synchronized (SingletonPreventThreading.class) {
                if (singleton == null) {
                    singleton = new SingletonPreventThreading();
                }
            }
        }

        return singleton;
    }

    public void show(){
        System.out.println("Hello");
    }

}

class Test implements Runnable {

    @Override
    public void run() {
        SingletonPreventThreading singleton = SingletonPreventThreading.getInstance();
        singleton.show();
        System.out.println(singleton.hashCode());
    }

    public static void main(String[] args) {

        Test test = new Test();

        Thread thread1 = new Thread(test,"t1");

        Thread thread2 = new Thread(test,"t2");

        thread1.start();
        thread2.start();


    }
}
