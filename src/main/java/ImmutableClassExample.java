
/*To create an immutable class in java, you have to do following steps.

        Declare the class as final so it can’t be extended.
        Make all fields private so that direct access is not allowed.
        Don’t provide setter methods for variables
        Make all mutable fields final so that it’s value can be assigned only once.
        Initialize all the fields via a constructor performing deep copy.
        Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
        */

import java.util.HashMap;

public final class ImmutableClassExample {

    private final String name;

    private final Dummy dummy;

    private  final HashMap<String, String> h1;


    ImmutableClassExample(String name, Dummy dummy, HashMap<String, String> h1){
        this.name = name;
        this.dummy = dummy;
        this.h1 = h1;
    }

    public String getName() {
        return name;
    }

    public Dummy getDummy() {
        return dummy;
    }

    public HashMap<String, String> getH1() {
        return h1;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ImmutableClassExample that = (ImmutableClassExample) o;
//        return getName().equals(that.getName());
//    }
//
//    @Override
//    public int hashCode() {
//     return Objects.hash(this.getName());
//    }
}

class Dummy{


}


class Test {

    public static void main(String[] args) {
        String name = "abc";
        Dummy dummy = new Dummy();

        HashMap<String, String> h1 = new HashMap<>();

        h1.put("1","2");
        h1.put("2","3");

        ImmutableClassExample immutableClassExample = new ImmutableClassExample(name, dummy , h1);

        System.out.println(name.equals(immutableClassExample.getName()));

        System.out.println(dummy==immutableClassExample.getDummy());

        System.out.println(h1 == immutableClassExample.getH1());


    }
}
