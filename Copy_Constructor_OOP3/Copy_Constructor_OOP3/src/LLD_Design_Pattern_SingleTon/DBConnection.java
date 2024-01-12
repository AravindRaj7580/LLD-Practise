package LLD_Design_Pattern_SingleTon;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    static Lock lc = new ReentrantLock();
    private static DBConnection dbc = null;
    private DBConnection(){
        System.out.println("Hello i'm okay");
    }
    public static DBConnection createInstance(){

        if(dbc == null){
            lc.lock();
            if(dbc == null){
                dbc = new DBConnection();
            }

            lc.unlock();
        }

        return dbc;

    }
//    public static synchronized DBConnection createInstance(){
//        if(dbc == null){
//            dbc = new DBConnection();
//        }
//
//        return dbc;
//
//    }
}
