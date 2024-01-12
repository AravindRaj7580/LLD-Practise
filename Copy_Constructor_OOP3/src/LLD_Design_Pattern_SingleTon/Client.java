package LLD_Design_Pattern_SingleTon;

public class Client {
    public static void main(String[] args) {
        DBConnection db = DBConnection.createInstance();
    }
}
