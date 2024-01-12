package ProducerConsumerProbSemaPhoreConCurrency4;



import java.util.Queue;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Queue<Object> qu = new ConcurrentLinkedQueue<>();
        int maxSize = 4;
        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);
        Producer p1 = new Producer(qu, "Producer1", maxSize, producerSemaphore, consumerSemaphore);
        Producer p2 = new Producer(qu, "Producer2", maxSize, producerSemaphore, consumerSemaphore);
        Producer p3 = new Producer(qu, "Producer3", maxSize, producerSemaphore, consumerSemaphore);

        Consumer c1 = new Consumer(qu, "consumer1", maxSize, producerSemaphore, consumerSemaphore);
        Consumer c2 = new Consumer(qu, "consumer2", maxSize, producerSemaphore, consumerSemaphore);
        Consumer c3 = new Consumer(qu, "consumer3", maxSize, producerSemaphore, consumerSemaphore);
        Consumer c4 = new Consumer(qu, "consumer4", maxSize, producerSemaphore, consumerSemaphore);
        Consumer c5 = new Consumer(qu, "consumer5", maxSize, producerSemaphore, consumerSemaphore);
        Consumer c6 = new Consumer(qu, "consumer6", maxSize, producerSemaphore, consumerSemaphore);





        Thread t1 = new Thread(p1);


        Thread t3 = new Thread(p2);
        Thread t4 = new Thread(p3);
        Thread t5 = new Thread(c1);
        Thread t6 = new Thread(c2);
        Thread t7 = new Thread(c3);
        Thread t8 = new Thread(c4);
        Thread t9 = new Thread(c5);
        Thread t10 = new Thread(c6);

        t1.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        System.out.println(qu.size());




        //this code will give us no such element Exception




    }
}
