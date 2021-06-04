package Fasada;

public class CashMachine {

    public boolean isCashMachineEmpty(){
        System.out.println("Bankomat nie jest pusty");
        return false;
    }

    public boolean isCachMachinBroken(){
        System.out.println("Bankomat nie jest zepsuty");
        return false;
    }

    public void getUserData(){
        System.out.println("Użytkownik wprowadził dane");
    }

    public void cashOut(){
        System.out.println("Pieniądze zostały wypłacone");
    }
}
