package collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionExamples {


    public static void main(String[] args) {

        Map<String,String> map =  new HashMap();

        map.put("1","2"); // this will accept only String type Object  (Generic)

        System.out.println(map);

        Map<?,?> map1 =  new HashMap();

        map1.put(null,null); // this will accept only Type of objects and type will calculate at run time

        System.out.println(map1);

        Map map2 =  new HashMap();

        map2.put(1,2); // this will accept Object and primitive type (Non generic)

        System.out.println(map2);

    }
}
