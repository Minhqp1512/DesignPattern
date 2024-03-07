package StructuralPattern.BridgePattern;

public class Client {
    public static void  main(String[] args){
        Bank vietcombank= new VietcomBank(new CheckingAccount());
        vietcombank.openAccount();
        Bank tpBank= new TPBank(new CheckingAccount());
        tpBank.openAccount();
    }
}
