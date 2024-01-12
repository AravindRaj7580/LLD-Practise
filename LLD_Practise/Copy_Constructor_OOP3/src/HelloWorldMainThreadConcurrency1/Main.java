package HelloWorldMainThreadConcurrency1;

public class Main {
    public  static  void main(String[] args){
        System.out.println("Hello World by thread " + Thread.currentThread().getName());
        doSomething();
    }
    public static void doSomething(){
        System.out.println("Hello World by thread " + Thread.currentThread().getName());
    }
}
