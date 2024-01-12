package ConCurrency2Assgn2Problem;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import  java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.concurrent.Future;

public class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException{

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ExecutorService exe = Executors.newCachedThreadPool();

        ArrayCreator arr = new ArrayCreator(n);

        Future<List<Integer>> futureArray = exe.submit(arr);

        List<Integer> ansArr = futureArray.get();

        System.out.println(ansArr);

    }
}
