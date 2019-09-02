package datastrcture;

import java.util.Arrays;

public class BinarySearch {


    static int  binarySearch(int [] array,int searchKey){
            int start=0;
            int end = array.length-1;
            while (start<=end){
                int mid = (start+end)/2;
                if(searchKey==array[mid])
                    return searchKey;
                if(searchKey<array[mid])
                    end = mid -1;
                else
                    start = mid +1;
            }
return  -1;

    }

    public static void main(String[] args) {

        int array[] = {1,2,6,3,4,9,10,3,67,23,82,23,5};
        int searchKey = 4;
        Arrays.sort(array);
//        Arrays.stream(array).forEach(System.out::print);
        System.out.println(binarySearch(array,searchKey));

    }
}
