package SynchronizedVariableConCurrency3;

public class Subtractor implements Runnable{
    public Count count;

    public Subtractor(Count c){
        this.count = c;
    }
    @Override
    public void run() {
        for(int i = 0; i<=100000; i++){
            synchronized (count){
                count.value -= i;
            }
        }

    }
}
