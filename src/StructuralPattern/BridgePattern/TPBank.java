package StructuralPattern.BridgePattern;

public class TPBank extends Bank{
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at TPBank is a");
        account.openAccount();
    }
}
