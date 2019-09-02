public class EvenOddUsingThread {



}

class EvenOddNumber implements  Runnable {


    private  int inputNumber;
    private Printer printer;

    public EvenOddNumber(int inputNumber, Printer printer) {
        this.inputNumber = inputNumber;
        this.printer = printer;
    }


    @Override
    public void run() {

        boolean isEven = (inputNumber % 2 == 0);

        int num = isEven ? 2:1;

        while (num <= inputNumber){

            if (isEven)
                printer.printEven(num);
            else
                printer.printOdd(num);

            num = num + 2;
        }

    }

}

class Printer {


    void printEven (int number){

    }

    void printOdd (int number){

    }


}