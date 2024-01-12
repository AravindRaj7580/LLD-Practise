package HashMapGenericExplainJavAdvConcpts1;

import java.util.HashMap;

public class Client {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "ujj");
        HashMap hm1 = new HashMap();
        hm1.put("ujj", 1);
        hm1.put(1, "ujj");
        for(var v : hm1.keySet()){
            System.out.println((Integer) v);
        }
    }
}
