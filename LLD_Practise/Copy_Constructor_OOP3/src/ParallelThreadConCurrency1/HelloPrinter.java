package ParallelThreadConCurrency1;

public class HelloPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello world by "+Thread.currentThread().getName());
    }
}
