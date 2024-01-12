package BackendLLD_Adapter.ThirdPartyAPI;

import BackendLLD_Adapter.ThirdPartyAPI.YesBankAPI.YesBank;

public class YesBankAdapter implements BankAPIAdapter{
    YesBank ys = new YesBank();
    @Override
    public double getBal() {
        return ys.checkBal();
    }

    @Override
    public int plusMoney(int from, int to) {
        return 0;
    }
}
