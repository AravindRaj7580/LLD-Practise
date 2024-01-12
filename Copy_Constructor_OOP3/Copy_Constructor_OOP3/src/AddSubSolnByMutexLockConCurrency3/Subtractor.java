package AddSubSolnByMutexLockConCurrency3;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Count count;
    Lock lock;
    public Subtractor(Count c, Lock l){
        this.count = c;
        this.lock = l;
    }
    @Override
    public void run() {
        for(int i = 0; i<=100000; i++){
            lock.lock();
            count.value -= i;
            lock.unlock();
        }


    }
}
