package  collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*
* Coding Challenge

     In this coding challenge you will be assessed on your ability to solve problems, the cleanliness of your code, and your testing skills.

The Challenge:
     Using Java, write a console application that takes a string as a command line parameter, performs the calculation defined below, and writes the output to the console.
Include the appropriate unit tests.

For example
     Given the string "gaeb7!!!8jeks5!!!tux10" return true if there are exactly 3 exclamation marks  between every pair of numbers that add up to 15. Otherwise return false.
 (Note: exclamation marks may be separated by other, non-numeric characters)

See the examples below:
     “gaeb7!!!8jeks5!!!tux10”   => true
     “kem!7!!nej!8ww1!!!!!!5”   => true
     “7!!!8!!!7!!!8!!!7”        => true
     “5!!aaaaaaaaaaaaa!10!5”    => false
     “Aa6!9”                    => false
* */

public class PairFinding {

    public static void main(String[] args) {

        Boolean flag = false;

        if (args.length == 0  || args.length != 1) // check input provide or not.
            System.out.println("please provide only one String wihtout any space");
        else {
            String inputString = args[0];

            Pattern pattern = Pattern.compile("[!]{3,}");

            Matcher matcher = pattern.matcher(inputString);

            while (matcher.find()) {
                if (pairFound(inputString, matcher)) {
                    System.out.println("true");
                    flag =true;
                    System.exit(0);
                }
            }

            if (!flag) {
                System.out.println("false");
            }

        }
    }

    private static Boolean pairFound(String inputString, Matcher matcher) {

        int pairStartIndex = matcher.start()-1;
        int pairLastIndex = (matcher.end());

        if(pairStartIndex!= -1 && pairLastIndex!= inputString.length() && pairLastIndex < 15){
            if (Character.isDigit(inputString.charAt(pairStartIndex)) && Character.isDigit(inputString.charAt(pairLastIndex)))
                return true;
            else
                return false;
        }
        return false;
    }

}