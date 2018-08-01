import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        collectionExamples(new ArrayList<>(),"ArrayList");
        collectionExamples(new LinkedList<>(),"LinkedList");
        collectionExamples(new LinkedHashSet<>(),"LinkedHashSet");
        collectionExamples(new Stack<>(),"Stack");
        collectionExamples(new TreeSet<>(new Car()),"TreeSet");


    }

    private static void collectionExamples(Collection<Car> collectiontype, String collectionName) {
        Collection<Car> collection = collectiontype;

        collection.add(new Car(2011,"ford"));
        collection.add(new Car(2012,"Audi"));
        collection.add(new Car(2011,"Audi"));
        collection.add(new Car(2014,"Jagwar"));
        collection.add(new Car(2016,"Tata"));
        collection.add(new Car(2013,"BMW"));
        collection.add(new Car(2015,"Daimler"));
        collection.add(null);

        System.out.println("Collection type "+collectionName +" and  size is "+collection.size());


        collection.stream()
                .filter(objects->Objects.nonNull(objects))
                .forEach(car-> System.out.println("year is "+car.getYearOfM()+" company name "+car.getCompanyName()));



        System.out.println();

    }

}



class Car implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {

        if(o1==null || o2==null)
            return 1;

        if(o1.getYearOfM() == o2.getYearOfM() && o1.getCompanyName().equals(o2.getCompanyName()))
            return  0;
        else if (o1.getYearOfM() < o2.getYearOfM())
            return  -1;
        else
            return 1;
    }


    public int getYearOfM() {
        return yearOfM;
    }

    public void setYearOfM(int yearOfM) {
        this.yearOfM = yearOfM;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    int yearOfM;
    String companyName;

    public Car(int yearOfM, String companyName) {
        this.yearOfM = yearOfM;
        this.companyName = companyName;
    }

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

    public Car() {


    }

}
