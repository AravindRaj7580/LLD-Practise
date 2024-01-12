package SorterConCurrency2;

import Overriding_OOP4.A;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {
        System.out.println("Thread has been executing is "+Thread.currentThread().getName());
        List<Integer> arr = List.of(3,6,1,9,5,4,9,4);
        ExecutorService exe = Executors.newCachedThreadPool();
        Sorter s = new Sorter(arr);
        //o/p order would be hi from arvind then executor with parallel thread and printing sorted array and finally bye from arvind
        //why order is mismatching. because, the exe.submit(s) is in future [future means it will give me answer in future so not consider now]
        //so it will start executing in parallel another thread
        //so currently the hi from arvind is printed then sorting is done by parallel thread but when ans.get(); is given the code has to wait until the parallel thread finish and give it's answer
        //because it is not in future scope after merge sorter finishes only it will execute bye from arvind

        Future<List<Integer>> ans = exe.submit(s);

        for(int i = 0; i<5; i++){
            System.out.println("hi from arvind by " + Thread.currentThread().getName());
        }

        List<Integer> answer = ans.get();
        System.out.println(answer);

        for(int i = 0; i<5; i++){
            System.out.println("bye from arvind by " + Thread.currentThread().getName());
        }

        exe.shutdown();
    }

}
