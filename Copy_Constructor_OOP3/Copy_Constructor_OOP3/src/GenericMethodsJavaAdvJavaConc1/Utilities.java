package GenericMethodsJavaAdvJavaConc1;

//public class Utilities<K, v> {
//    public static void doSome(K val, V val1){
//
//    }
//}
//above line will give us error


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Stack;

public  class Utilities<K, V>{
    //even-though it is static now it is accepting generic because <K, V > generics has been given after static this will make possible this ex.
    //Same stands for List.of() function if you have doubts look into the definition of that function

    public static <K, V> void doSome(K key, V value){
        System.out.println(key);
        System.out.println(value);

    }



}
