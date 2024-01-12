package BackendLLD_Adapter.ThirdPartyAPI;

public class Client {
    public static void main(String[] args){
//        PhonePe pp = new PhonePe(new ICICIBankAdapter());
        PhonePe pp = new PhonePe(new YesBankAdapter());
        pp.doSomething();
    }
}
