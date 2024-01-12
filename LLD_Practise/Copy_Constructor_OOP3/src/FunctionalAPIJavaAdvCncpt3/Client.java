package FunctionalAPIJavaAdvCncpt3;

public class Client {
    public static void main(String[] args){
        Printing r = new Printing();

//        Runnable r = () -> {
//            System.out.println("Hi with lambda");
//        };
//        Thread t1 = new Thread(r);
//        t1.start();
        Thread t2 = new Thread(() -> {
            System.out.println("Hi with lambda exp");
        });
        t2.start();
    }
}
