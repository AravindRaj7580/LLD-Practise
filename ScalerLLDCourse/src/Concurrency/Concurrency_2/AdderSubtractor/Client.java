package Concurrency.Concurrency_2.AdderSubtractor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception{
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);
        Thread t1 = new Thread(adder);
        t1.start();

        Thread t2 = new Thread(subtractor);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.value);
    }



}
