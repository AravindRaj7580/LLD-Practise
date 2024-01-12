package print1to100ThreadConCurrency1;

public class Printer implements Runnable{
    int numToPrint;

    Printer(int num){
        this.numToPrint = num;
    }


    @Override
    public void run() {
        System.out.println("Number to be Printed is "+ numToPrint + " in thread "+Thread.currentThread().getName() );
    }
}
