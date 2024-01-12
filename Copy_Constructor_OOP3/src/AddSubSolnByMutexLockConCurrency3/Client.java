package AddSubSolnByMutexLockConCurrency3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lock lck = new ReentrantLock();
        Count c = new Count();
        Adder ad = new Adder(c, lck);
        Subtractor sub = new Subtractor(c,lck);
        Thread t1 = new Thread(ad);
        t1.start();
        Thread t2 = new Thread(sub);
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.value);


    }

}
