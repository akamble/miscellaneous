package designpattern;

import java.lang.reflect.Constructor;

public class SingletonPreventReflection {

    private static SingletonPreventReflection singleton;

    private SingletonPreventReflection() {

    }

    public static  SingletonPreventReflection getInstance() {

       if (singleton == null) {
           singleton = new SingletonPreventReflection();
       }
        return singleton;
    }

    public void show(){
        System.out.println("Hello");
    }

}

class SingletonPreventReflectionTest {

    public static void main(String[] args) {

        SingletonPreventReflection test = SingletonPreventReflection.getInstance();
        test.show();
        System.out.println(test.hashCode());

        SingletonPreventReflection test2 = null;
        try{
            Constructor[] constructor = SingletonPreventReflection.class.getDeclaredConstructors();

            for (Constructor constructor1:constructor){
                constructor1.setAccessible(true);
                test2 = (SingletonPreventReflection) constructor1.newInstance();
                break;
            }

        }catch (Exception e){
            e.printStackTrace();

        }

        test2.show();
        System.out.println(test2.hashCode());

    }
}
