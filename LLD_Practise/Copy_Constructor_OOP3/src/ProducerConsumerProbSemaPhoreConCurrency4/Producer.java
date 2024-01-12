package ProducerConsumerProbSemaPhoreConCurrency4;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> qu;
    String name;
    int maxSize;

    private Semaphore producer;

    private Semaphore consumer;


    public Producer(Queue<Object> ob, String names, int maxSize, Semaphore producer, Semaphore consumer){
        this.maxSize = maxSize;
        this.name = names;
        this.qu = ob;
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {

        while(true){
            try {
                producer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(qu.size() < maxSize){
                qu.add((new Object()));
            }
            consumer.release();
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
