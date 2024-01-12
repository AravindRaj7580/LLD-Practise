package AddrSubrLambdaJavaAdv3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Count c = new Count(0);
        Lock l = new ReentrantLock();

        Runnable r = () -> {
            for (int i = 0; i < 100000; i++) {
                l.lock();
                c.value += i;
                l.unlock();
            }
        };

        Runnable r1 = () -> {
            for (int i = 0; i < 100000; i++) {
                l.lock();
                c.value -= i;
                l.unlock();
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        System.out.println(c.value);
    }

}
