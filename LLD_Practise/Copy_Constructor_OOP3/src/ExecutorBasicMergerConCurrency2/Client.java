package ExecutorBasicMergerConCurrency2;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);
//        Sorter ss = new Sorter(list);
//
//        List<Integer> ansArray = ss.call();
        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter s = new Sorter(list, executor);
        Future<List<Integer>> ans = executor.submit(s);

        List<Integer> ansArray = ans.get();

        System.out.println(ansArray);
















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































    }



}
