package ExecutorIntro_ConCurrency2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args){
        ExecutorService exe  = Executors.newFixedThreadPool(10);
//        ExecutorService exe  = Executors.newCachedThreadPool();
        for(int i = 1; i<=100; i++){
            if(i == 5 || i == 11 || i == 20){
                System.out.println("debug");
            }
            Printer p = new Printer(i);
            exe.execute(p);
        }
        exe.shutdown();


    }
}
