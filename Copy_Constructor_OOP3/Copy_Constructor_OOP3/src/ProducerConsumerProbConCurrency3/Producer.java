package ProducerConsumerProbConCurrency3;
import java.util.Queue;

public class Producer implements Runnable{
    Queue<Object> qu;
    String name;
    int maxSize;

    public Producer(Queue<Object> ob, String names, int maxSize){
        this.maxSize = maxSize;
        this.name = names;
        this.qu = ob;
    }

    @Override
    public void run() {
        while(true){
            if(qu.size() < maxSize){
                qu.add((new Object()));
            }
        }
//        synchronized (qu){
//            while(true){
//                if(qu.size() < maxSize){
//                    qu.add((new Object()));
//                }
//            }
//        }
        //synchronized is an first fix for P-C prob but it is not fast enough


    }
}
