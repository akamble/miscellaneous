package basic;

public class FinalVsImmutabilityExample {

    public static void main(String[] args) {

       final  StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("before append hashcode "+stringBuffer.hashCode());

        stringBuffer.append("world");

        // to make class Immutability then do not provide the setter.

        System.out.println("after append hashcode "+stringBuffer.hashCode());

        System.out.println(stringBuffer);
    }
}
