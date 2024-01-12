package ConCurrency2Assgn2Problem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


public class ArrayCreator implements Callable<List<Integer>> {

    public int n;

    public ArrayCreator(int n){

        // this.arr = new ArrayList<>();

        // for(int i = 1; i<=n; i++){
        //     this.arr.add(i);
        // }
        this.n = n;

    }

    @Override
    public List<Integer> call() throws Exception{

        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            arr.add(i);
        }
        return arr;

    }
}
