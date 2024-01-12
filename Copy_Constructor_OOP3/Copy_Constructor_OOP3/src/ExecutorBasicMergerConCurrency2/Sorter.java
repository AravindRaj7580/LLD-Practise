package ExecutorBasicMergerConCurrency2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>>{
    public List<Integer> arrayToSort;

    public ExecutorService exe;

    public Sorter(List<Integer> list, ExecutorService executor){
        this.exe = executor;
        this.arrayToSort = list;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Called by thread - " + Thread.currentThread().getName());
        System.out.println(arrayToSort);

        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

         for(int i = 0; i<mid; i++){
             leftArray.add(arrayToSort.get(i));
         }

        for(int i = mid; i<arrayToSort.size(); i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftMs = new Sorter(leftArray, exe);
        Sorter rightMs = new Sorter(rightArray, exe);


        Future<List<Integer>> leftSortedArrayFuture = exe.submit(leftMs);
        Future<List<Integer>> rightSortedArrayFuture = exe.submit(rightMs);

        List<Integer> leftSortedArray = leftSortedArrayFuture.get(); //code will not go further till i have the final result here from this thread
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        int leftPointr = 0;
        int rightPointr = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while(leftPointr < leftSortedArray.size() && rightPointr < rightSortedArray.size()){
            if(leftSortedArray.get(leftPointr) < rightSortedArray.get(rightPointr)){
                sortedArray.add(leftSortedArray.get(leftPointr));
                leftPointr++;
            }else{
                sortedArray.add(rightSortedArray.get(rightPointr));
                rightPointr++;
            }
        }

        while(leftPointr < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(leftPointr));
            leftPointr++;
        }

        while(rightPointr < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(rightPointr));
            rightPointr++;
        }
        exe.shutdown();;
        return sortedArray;
    }


//draft 2 with executors
//    public Sorter(List<Integer> list){
//        this.arrayToSort = list;
//    }
//
//    @Override
//    public List<Integer> call() throws Exception {
//
//        System.out.println("Called by thread - " + Thread.currentThread().getName());
//        System.out.println(arrayToSort);
//
//        if(arrayToSort.size() <= 1){
//            return arrayToSort;
//        }
//
//        int mid = arrayToSort.size()/2;
//
//        List<Integer> leftArray = new ArrayList<>();
//        List<Integer> rightArray = new ArrayList<>();
//
//         for(int i = 0; i<mid; i++){
//             leftArray.add(arrayToSort.get(i));
//         }
//
//        for(int i = mid; i<arrayToSort.size(); i++){
//            rightArray.add(arrayToSort.get(i));
//        }
//
//        Sorter leftMs = new Sorter(leftArray);
//        Sorter rightMs = new Sorter(rightArray);
//
//        ExecutorService exe = Executors.newCachedThreadPool();
//
//
//        Future<List<Integer>> leftSortedArrayFuture = exe.submit(leftMs);
//        Future<List<Integer>> rightSortedArrayFuture = exe.submit(rightMs);
//
//        List<Integer> leftSortedArray = leftSortedArrayFuture.get(); //code will not go further till i have the final result here from this thread
//        List<Integer> rightSortedArray = rightSortedArrayFuture.get();
//
//        int leftPointr = 0;
//        int rightPointr = 0;
//
//        List<Integer> sortedArray = new ArrayList<>();
//
//        while(leftPointr < leftSortedArray.size() && rightPointr < rightSortedArray.size()){
//            if(leftSortedArray.get(leftPointr) < rightSortedArray.get(rightPointr)){
//                sortedArray.add(leftSortedArray.get(leftPointr));
//                leftPointr++;
//            }else{
//                sortedArray.add(rightSortedArray.get(rightPointr));
//                rightPointr++;
//            }
//        }
//
//        while(leftPointr < leftSortedArray.size()){
//            sortedArray.add(leftSortedArray.get(leftPointr));
//            leftPointr++;
//        }
//
//        while(rightPointr < rightSortedArray.size()){
//            sortedArray.add(rightSortedArray.get(rightPointr));
//            rightPointr++;
//        }
//        exe.shutdown();;
//        return sortedArray;
//
//
//    }


    //draft 1 without executors
//    public Sorter(List<Integer> array){
//        this.arrayToSort = array;
//    }


//    @Override
//    public List<Integer> call() throws Exception {
//        if(arrayToSort.size() <= 1){
//            return arrayToSort;
//        }
//
//        int mid = arrayToSort.size()/2;
//
//        List<Integer> leftArray = new ArrayList<>();
//        List<Integer> rightArray = new ArrayList<>();
//
//         for(int i = 0; i<mid; i++){
//             leftArray.add(arrayToSort.get(i));
//         }
//
//        for(int i = mid; i<arrayToSort.size(); i++){
//            rightArray.add(arrayToSort.get(i));
//        }
//
//        Sorter leftMs = new Sorter(leftArray);
//        Sorter rightMs = new Sorter(rightArray);
//
//        List<Integer> leftSortedArray = leftMs.call();
//        List<Integer> rightSortedArray = rightMs.call();
//
//        int leftPointr = 0;
//        int rightPointr = 0;
//
//        List<Integer> sortedArray = new ArrayList<>();
//
//        while(leftPointr < leftSortedArray.size() && rightPointr < rightSortedArray.size()){
//            if(leftSortedArray.get(leftPointr) < rightSortedArray.get(rightPointr)){
//                sortedArray.add(leftSortedArray.get(leftPointr));
//                leftPointr++;
//            }else{
//                sortedArray.add(rightSortedArray.get(rightPointr));
//                rightPointr++;
//            }
//        }
//
//        while(leftPointr < leftSortedArray.size()){
//            sortedArray.add(leftSortedArray.get(leftPointr));
//            leftPointr++;
//        }
//
//        while(rightPointr < rightSortedArray.size()){
//            sortedArray.add(rightSortedArray.get(rightPointr));
//            rightPointr++;
//        }
//
//        return sortedArray;
//          }

}
