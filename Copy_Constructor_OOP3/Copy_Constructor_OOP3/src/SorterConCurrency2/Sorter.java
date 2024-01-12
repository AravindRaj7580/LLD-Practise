package SorterConCurrency2;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>{
    private List<Integer> arrayToSort;


    Sorter(List<Integer> array){
        this.arrayToSort = array;
    }
    @Override
    public List<Integer> call() throws Exception {

        System.out.println("Current thread that is executing is thread "+ Thread.currentThread().getName());

        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        List<Integer> leftArrayToBeSorted = new ArrayList<>();
        List<Integer> rightArrayToBeSorted = new ArrayList<>();

        for(int i = 0; i < mid; i++){
            leftArrayToBeSorted.add(arrayToSort.get(i));
        }

        for(int i = mid; i<arrayToSort.size(); i++){
            rightArrayToBeSorted.add(arrayToSort.get(i));
        }

        Sorter leftSorter = new Sorter(leftArrayToBeSorted);
        Sorter rightSorter = new Sorter(rightArrayToBeSorted);

        ExecutorService exe = Executors.newCachedThreadPool();

        Future<List<Integer>> FutureleftSortedArray = exe.submit(leftSorter);
        Future<List<Integer>> FuturerightSortedArray = exe.submit(rightSorter);

        List<Integer> leftSortedArray = FutureleftSortedArray.get();
        List<Integer> rightSortedArray = FuturerightSortedArray.get();

//        List<Integer> leftSortedArray = leftSorter.call();
//        List<Integer> rightSortedArray = rightSorter.call();

        int leftPointer = 0;
        int rightPointer = 0;

        List<Integer> finalArray = new ArrayList<>();

        while(leftPointer < leftSortedArray.size() && rightPointer < rightSortedArray.size()){
            if(leftSortedArray.get(leftPointer) < rightSortedArray.get(rightPointer)){
                finalArray.add(leftSortedArray.get(leftPointer));
                leftPointer++;
            }else{
                finalArray.add(rightSortedArray.get(rightPointer));
                rightPointer++;
            }
        }

        while(leftPointer < leftSortedArray.size()){
            finalArray.add(leftSortedArray.get(leftPointer));
            leftPointer++;
        }

        while(rightPointer < rightSortedArray.size()){
            finalArray.add(rightSortedArray.get(rightPointer));
            rightPointer++;
        }
        exe.shutdown();
        return finalArray;
    }
}
