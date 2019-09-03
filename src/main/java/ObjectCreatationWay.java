
/*
* In java, we can create defaultInterfaceMethod2 object in 5 different ways
*
* 1. Using new Keyword  --> constructor gets called
* 2. Using newInstance() method if Class -->
* 3. USing newInstance() method of Constructor -->
* 4. Using clone() -->
* 5. Using deserialization -->
* */

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreatationWay {

    public static void main(String[] args) {

        //1. using Constructor
        Vehicle vehicle = new Vehicle();
        System.out.println("1. Using " +vehicle.getType());
        System.out.println(new Vehicle("1.1 Using parametrized constructor").getType());

        //2. Using Clone

            Vehicle vehicl =(Vehicle) vehicle.clone();
            System.out.println("2. Using Clone of object and it uses " +vehicl.getType());




        //3. Using newInstance()
        try{
            Vehicle vehic= (Vehicle)Class.forName("Vehicle").newInstance();
            System.out.println("3. Using newInstance() method and it uses "+vehic.getType());
        }catch (ClassNotFoundException | IllegalAccessException |InstantiationException e)
        {
            e.printStackTrace();
        }


        try{
            Vehicle vehi= Vehicle.class.newInstance();
            System.out.println("3.1 Using newInstance() method without casting the object and it uses "+vehi.getType());
        }catch (IllegalAccessException |InstantiationException e)
        {
            e.printStackTrace();
        }

        //4. Using Constructor

        try {
            Constructor<Vehicle> vehicleConstructor = Vehicle.class.getConstructor();
            System.out.println("4. Using Constructor and newInstance() method without casting the object and it uses "+vehicleConstructor.newInstance().getType());
        }catch (InvocationTargetException |IllegalAccessException| InstantiationException|NoSuchMethodException e){
            e.printStackTrace();
        }

        //5. Using deserialization

        Vehicle type5 = new Vehicle("Using serialize and deserialize");

        try {
           ObjectOutputStream objectOutputStream =  new ObjectOutputStream(new FileOutputStream("Temp.obj"));

            objectOutputStream.writeObject(type5);
            objectOutputStream.close();

           ObjectInputStream objectInputStream =  new ObjectInputStream(new FileInputStream("Temp.obj"));
            Vehicle vs=(Vehicle)objectInputStream.readObject();
            System.out.println("5. Using "+ vs.getType());

        } catch (ClassNotFoundException|IOException e) {
            e.printStackTrace();
        }


    }
}
class Vehicle implements  Cloneable,Serializable {
    private String type;

    public  Vehicle(){
        this.type="Default constructor";
    }
    public Vehicle(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public Object clone(){
        Object o = null;
        try{
            o=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return o;
    }
}
