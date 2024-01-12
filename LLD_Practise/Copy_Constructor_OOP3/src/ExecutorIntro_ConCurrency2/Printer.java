package ExecutorIntro_ConCurrency2;

public class Printer implements  Runnable{
    int numtoPrint;

    public Printer(int num){
        this.numtoPrint = num;
    }
    @Override
    public void run() {
        System.out.println("the number that is printing = "+this.numtoPrint+" and the thread printing it is "+Thread.currentThread().getName());

    }
}
