package SynchronizedVariableConCurrency3;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count cou = new Count();
        Adder ad = new Adder(cou);
        Subtractor sub = new Subtractor(cou);
        Thread t1 = new Thread(ad);
        t1.start();
        Thread t2 = new Thread(sub);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cou.value);

    }


}
