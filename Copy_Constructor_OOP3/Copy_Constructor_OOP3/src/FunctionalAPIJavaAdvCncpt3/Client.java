package FunctionalAPIJavaAdvCncpt3;

import ExecutorIntro_ConCurrency2.Printer;

public class Client {
    public static void main(String[] args){
        Printing r = new Printing();

//        Runnable r = () -> {
//            System.out.println("Hi with lambda");
//        };
//        Thread t1 = new Thread(r);
//        t1.start();
        Thread t2 = new Thread(() -> {
            System.out.println("Hi with lambda");
        });
        t2.start();
    }
}
