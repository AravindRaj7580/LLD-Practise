package ProducerConsumerProbSemaPhoreConCurrency4;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable{
    Queue<Object> qu;
    String name;
    int maxSize;

    private Semaphore producer;

    private Semaphore consumer;

    public Consumer(Queue<Object> ob, String names, int maxSize, Semaphore producer, Semaphore consumer){
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
                consumer.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(qu.size() > 0){
                qu.remove();
            }
            producer.release();
        }
//        synchronized (qu){
//            while(true){
//                if(qu.size() > 0){
//                    qu.remove();
//                }
//            }
//        }


    }
}
