package SynchronizedVariableConCurrency3;

public class Adder implements Runnable{
    public Count count;

    public Adder(Count c){
        this.count = c;
    }
    @Override
    public void run() {
        for(int i = 0; i<=100000; i++){
            synchronized (count){
                count.value += i;
            }
        }

    }
}
