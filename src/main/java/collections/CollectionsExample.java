package collections;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        collectionExamples(new ArrayList<>(), "ArrayList");
        collectionExamples(new LinkedList<>(), "LinkedList");
        collectionExamples(new LinkedHashSet<>(), "LinkedHashSet");
        collectionExamples(new Stack<>(), "Stack");
        collectionExamples(new TreeSet<>(new Car()), "TreeSet");


    }

    private static void collectionExamples(Collection<Car> collectiontype, String collectionName) {
        Collection<Car> collection = collectiontype;

        collection.add(new Car(2011, "BMW"));
        collection.add(new Car(2015, "Audi"));
        collection.add(new Car(2012, "Diamlor"));
        collection.add(new Car(2012, "Diamlor"));
//        collection.add(null);

        System.out.println("Collection type " + collectionName + " and  size is " + collection.size());


        collection.stream()
                .filter(objects -> Objects.nonNull(objects))
                .forEach(car -> System.out.println("year is " + car.getYearOfM() + " company name " + car.getCompanyName()));


        System.out.println();

    }

}


class Car implements Comparator<Car> {

    private int yearOfM;
    private String companyName;

    public Car() {
    }

    public Car(int yearOfM, String companyName) {
        this.yearOfM = yearOfM;
        this.companyName = companyName;
    }


    public int getYearOfM() {
        return yearOfM;
    }

    public String getCompanyName() {
        return companyName;
    }


    // hascode and equal method required for the HashSet to remove duplicate object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfM == car.yearOfM &&
                Objects.equals(companyName, car.companyName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(yearOfM, companyName);
    }

    // comapre method required for tree set to sort the elements.
    @Override
    public int compare(Car o1, Car o2) {

        if (o1 == null || o2 == null)
            return 1;

        if (o1.getCompanyName().equals(o2.getCompanyName()) && o1.getYearOfM() == o2.getYearOfM())// removing duplicate objects
            return 0;
        else if (o1.getCompanyName().compareTo(o2.getCompanyName()) < 0) // sort based on the field used in the custom object
            return -1;
        else
            return 1;
    }
}
