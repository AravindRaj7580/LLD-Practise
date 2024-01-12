package GenericUnderStandingJavaAdvCncpts1;

import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args){
//        HashMap hm = new HashMap();
//        hm.put(1, "ujj");
//        hm.put("hello", 7);
//        System.out.println(hm);
        //above Hashmap will accept any datatype as because java is backward compatibility
        //Modern Day HashMap is like this using Generics HashMap<Integer, Integer> hm = new HashMap<>();
//        Pair p = new Pair(1,2);
//        usual pair object creation
        Pair<Double, Double> p1 = new Pair<>();
        p1.setFirst(4.0);
        System.out.println(p1.first);
        List list = List.of(1,2,3,4,5,6,7,8,9);


    }
}
