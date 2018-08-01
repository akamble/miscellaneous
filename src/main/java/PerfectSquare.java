public class PerfectSquare {
    public static boolean isPerfectSquare(double number){

        double sqrt = Math.sqrt(number);

        return (sqrt - Math.floor(sqrt))==0;
    }
    public static void main(String[] args) {

        long t= System.currentTimeMillis();
        int power=0;
        int startRange=0;
        int endRange = 100;
        startRange=startRange<0?0:startRange;

        for (int i = startRange ; i <= endRange;i++) {

            if (isPerfectSquare(i)) {
                System.out.println(i);
                i = (2*power)+i;
                power++;
            }
        }
        System.out.println("required time is:"+(System.currentTimeMillis()-t)+" milisec");
    }

}
