package ExecutorBasicsConCurrency2;

public class Printer implements Runnable {
    int numToPrint;

    public Printer(int num){
        this.numToPrint = num;
    }

    @Override
    public void run() {
        System.out.println("Number has been executing "+ numToPrint + " and thread is "+Thread.currentThread().getName());
    }
}
