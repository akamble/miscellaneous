package basic;

public final class ImmutableClassExample {

    private final String name;

    public ImmutableClassExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        String name ="Test";
        ImmutableClassExample immutableClassExample = new ImmutableClassExample(name);



        System.out.println(name == immutableClassExample.name);


    }
}
