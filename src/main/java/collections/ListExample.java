package collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {


    private static class Car {

        String carName;

        public Car(String carName) {
            this.carName = carName;
        }

        public String getCarName() {
            return carName;
        }

        public String toString() {
            return carName;
        }

    }

    public static void main(String[] args) {

        List<Car> arrayList = new ArrayList<>();

        arrayList.add(new Car("bmw"));
        arrayList.add(new Car("audi"));
        arrayList.add(new Car("audi"));
        arrayList.add(null);

        System.out.print("ArrayList size is:" + arrayList.size());
        System.out.println(arrayList);

        List<Car> linkedList = new LinkedList<>();

        linkedList.add(new Car("bmw"));
        linkedList.add(new Car("audi"));
        linkedList.add(new Car("audi"));
        linkedList.add(null);

        System.out.print("\nLinkedList size is:" + linkedList.size());
        System.out.println(linkedList);

    }
}

