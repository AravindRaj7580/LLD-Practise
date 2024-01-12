package AdderSubtractorProblemConCurrency2;

import Overriding_OOP4.A;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Adder ad = new Adder(c);
        Subtractor sub = new Subtractor(c);
        Thread t1 = new Thread(ad);
        t1.start();
        Thread t2  = new Thread(sub);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.value);
    }
}
