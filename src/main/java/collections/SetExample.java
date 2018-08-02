package collections;

import java.util.*;

public class SetExample {

    private static class Car implements Comparable<Car> {

        String carName;

        public Car() {
        }

        public Car(String carName) {
            this.carName = carName;
        }

        public String getCarName() {
            return carName;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode("");
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Car car = (Car) obj;
            return carName.equals(car.getCarName());
        }

        public String toString() {
            return carName;
        }

        @Override
        public int compareTo(Car o) {
            if (o== null) return 1;
            if (o.getCarName().equals(this.getCarName())) return 0;
            else if (this.getCarName().compareTo(o.getCarName()) < 0) return -1;
            else return 1;
        }
    }

    public static void main(String[] args) {

        Set<Car> hashSet = new HashSet<>();

        hashSet.add(new Car("bmw"));
        hashSet.add(new Car("audi"));
        hashSet.add(new Car("audi"));
        hashSet.add(null);

        System.out.print("HashSet size is:" + hashSet.size());
        System.out.println(hashSet);


        Set<Car> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new Car("bmw"));
        linkedHashSet.add(new Car("audi"));
        linkedHashSet.add(new Car("audi"));
        linkedHashSet.add(null);

        System.out.print("LinkedHashSet size is:" + linkedHashSet.size());
        System.out.println(linkedHashSet);


        Set<Car> treeSet = new TreeSet<>();

        treeSet.add(new Car("bmw"));
        treeSet.add(new Car("audi"));
        treeSet.add(new Car("audi"));

        System.out.print("TreeSet size is:" + treeSet.size());
        System.out.println(treeSet);

    }
}


