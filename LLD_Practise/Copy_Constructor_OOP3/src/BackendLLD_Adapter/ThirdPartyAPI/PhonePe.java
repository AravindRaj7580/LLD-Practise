package BackendLLD_Adapter.ThirdPartyAPI;

public class PhonePe {
    private BankAPIAdapter bankApi;

    public PhonePe(BankAPIAdapter bankApi){
        this.bankApi = bankApi;
    }

    public void doSomething(){
        double balance = bankApi.getBal();
        System.out.println("Balance : "+balance);

    }
}
