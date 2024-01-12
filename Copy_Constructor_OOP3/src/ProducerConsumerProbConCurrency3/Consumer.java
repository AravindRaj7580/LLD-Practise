package ProducerConsumerProbConCurrency3;

import java.util.Queue;

public class Consumer implements  Runnable{
    Queue<Object> qu;
    String name;
    int maxSize;

    public Consumer(Queue<Object> ob, String names, int maxSize){
        this.maxSize = maxSize;
        this.name = names;
        this.qu = ob;
    }

    @Override
    public void run() {
        while(true){
            if(qu.size() > 0){
                qu.remove();
            }
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
