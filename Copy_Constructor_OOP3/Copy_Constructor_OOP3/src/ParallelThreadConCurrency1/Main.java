package ParallelThreadConCurrency1;

public class Main {
    public static void main(String[] args){
        HelloPrinter hxp = new HelloPrinter();
        System.out.println("Hello world by "+Thread.currentThread().getName());
        Thread t = new Thread(hxp);
//        t.run();
        t.start();
        System.out.println("bye by "+Thread.currentThread().getName());
    }
}
//what we have expected is

//Hello world by main
//Hello world by Thread-0
//bye by main

//but actual result is
//Hello world by main
//    bye by main
//        Hello world by Thread-0

//why because due to it is not sequential order it is in parallel
//hello world and bye in main is taken by one thread and hello world in Hello-printer was taken care by another thread executes parallel

//Important observation is
//t.start() is responsible for creating new thread to perform task in parallel
//in our code if we uncomment t.run() and comment t.start() and start code there will be no thread has been created all the task will be executed sequentially and executes in single thread which is main