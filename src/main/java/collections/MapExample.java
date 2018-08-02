package collections;

import java.util.*;

public class MapExample {

    private static class Car implements Comparable<Car>{

        String carName;

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
            if(this==obj) return  true;
            if(obj==null && obj.getClass()!=getClass()) return  false;

            Car car = (Car)obj;
            return getCarName().equals(car.getCarName());
        }

        public String toString() {
            return carName;
        }

        @Override
        public int compareTo(Car o) {
            if(o==null) return 1;
            if(this.getCarName().equals(o.getCarName())) return  0;
            else if(this.getCarName().compareTo(o.getCarName())<0) return -1;
            else return  1;
        }
    }

    public static void main(String[] args) {

        Map<Car,Integer> hashMap = new HashMap<>();

        hashMap.put(new Car("audi"),2);
        hashMap.put(new Car("bmw"),1);
        hashMap.put(new Car("audi"),2);
        hashMap.put(new Car("audi"),3);
        hashMap.put(null,6);

        System.out.print("HashMap size is:" + hashMap.size());
        System.out.println(" "+hashMap);


        Map<Car,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(new Car("audi"),2);
        linkedHashMap.put(new Car("bmw"),1);
        linkedHashMap.put(new Car("audi"),2);
        linkedHashMap.put(new Car("audi"),3);
        linkedHashMap.put(null,6);

        System.out.print("LinkedHashMap size is:" + linkedHashMap.size());
        System.out.println(" "+linkedHashMap);


        Map<Car,Integer> treeMap = new TreeMap<>();

        treeMap.put(new Car("audi"),2);
        treeMap.put(new Car("bmw"),1);
        treeMap.put(new Car("audi"),2);
        treeMap.put(new Car("audi"),3);

        System.out.print("TreeMap size is:" + treeMap.size());
        System.out.println(" "+treeMap);

    }
}
