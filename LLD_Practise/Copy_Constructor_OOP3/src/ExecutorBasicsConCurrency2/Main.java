package ExecutorBasicsConCurrency2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args){

        ExecutorService exe = Executors.newFixedThreadPool(10);
        //below line can be used to enable only one thread for an task
        //ExecutorService exe1 = Executors.newSingleThreadExecutor();
        //what this below executor service do is it will assign task which is free if nothing is free and still there is task to do in that case it will create an new thread and assign that task into it
        ExecutorService exe2 = Executors.newCachedThreadPool();
        for(int i = 1; i<=100; i++){
            //below condition helps us to understand the wait queue in executors
            if(i == 5 || i == 11 || i == 20){
                System.out.println("Debugging");

            }
            Printer np = new Printer(i);
            exe.execute(np);
        }
        exe.shutdown();
        //whenever we use executor make sure that you shut it down after finishing your task
        //here our task is to print the numbers 1 -->100 that has been achieved using executors and by 10 threads fixed after finishing this shut it down
    }
    //if we look into the output at ExecutorService exe = Executors.newFixedThreadPool(10);
    //the numbers has been printed using only 10 threads not more than 10 threads
    //so what executor do is, it will take care of creating thread and managing them though the threads are fixed in our example
}
