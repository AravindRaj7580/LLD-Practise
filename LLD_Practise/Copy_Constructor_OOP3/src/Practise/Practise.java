package Practise;

import java.util.LinkedList;

import static Practise.Testing.*;

public class Practise implements Testing {

    static int sum = 9;
    int sum1 = 10;
    static void doSome(int hi){

        sum = hi;
    }


    @Override
    public void donothing() {
        System.out.println("hello");
    }
}
