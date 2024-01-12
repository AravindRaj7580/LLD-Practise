package print1to100ThreadConCurrency1;

public class Main {
    public static void main(String[] args){
        for(int i = 0; i<100; i++){
            Printer np = new Printer(i);
            Thread t = new Thread(np);
            t.start();
            //start() = create new thread + run()
        }

    }
}
