package BackendLLD_Adapter.ThirdPartyAPI;

import BackendLLD_Adapter.ThirdPartyAPI.ICICIBankAPI.ICICIBank;

public class ICICIBankAdapter implements BankAPIAdapter{
    ICICIBank ic = new ICICIBank();
    @Override
    public double getBal() {
        return ic.checkBal();
    }

    @Override
    public int plusMoney(int from, int to) {
        return 0;
    }
}
