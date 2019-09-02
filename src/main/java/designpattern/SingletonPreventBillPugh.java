package designpattern;

public class SingletonPreventBillPugh {

    private SingletonPreventBillPugh(){

    }

    public static class SingletonPreventBillPughInnerClass {
        private static final SingletonPreventBillPugh SINGLETON_INSTANCE = new SingletonPreventBillPugh();
    }

    public static SingletonPreventBillPugh getInstance() {

        return SingletonPreventBillPughInnerClass.SINGLETON_INSTANCE;
    }



    public void show(){
        System.out.println("Hello");
    }

}

class SingletonPreventBillPughTest  implements  Runnable {

    @Override
    public void run() {
        SingletonPreventBillPugh test = SingletonPreventBillPugh.getInstance();
        test.show();
        System.out.println(test.hashCode());
    }

    public static void main(String[] args) {
        SingletonPreventBillPughTest test = new SingletonPreventBillPughTest();
        Thread thread1 = new Thread(test, "1");
        Thread thread2 = new Thread(test, "2");

        thread1.start();
        thread2.start();



    }
}
