package  collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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