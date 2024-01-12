package AdderSubtractorProblemConCurrency2;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count val){
        this.count = val;
    }
    @Override
    public void run() {
        for(int i = 0; i<100000; i++){
            count.value -= i;
//            count.value.getAndAdd(-i);
        }

    }
}
