package BridgePattern;

public class VietcomBank extends  Bank{
    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at VietComBank is a");
        account.openAccount();
    }
}
