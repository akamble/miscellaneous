package basic;

public interface Goat {
     int vals = 4;

     void show();

     default  void defaultInterfaceMethod1(){

         System.out.println("interface default method 1");
     }

      default void defaultInterfaceMethod2() {
         System.out.println("interface default method 2");
     }

     static  void interfaceStaticMethod(){

         System.out.println("static method in interface");
     }


}

abstract  class GoatAbstract implements Goat {

    int v =4;


    static void sd(){

    }

}

class GoatImplementation extends GoatAbstract {

    @Override
    public void show() {

        v = 5;
        System.out.println("GoatImplementation show method"+ v);
    }

    public static void main(String[] args) {
        GoatImplementation implementation = new GoatImplementation();
        implementation.show();
        implementation.defaultInterfaceMethod1();
        implementation.defaultInterfaceMethod2();
        Goat.interfaceStaticMethod();
    }
}
