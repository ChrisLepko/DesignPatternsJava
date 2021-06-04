package Pełnomocnik;

public class BankAccount implements IBankAccount{
    @Override
    public void cashOut() {
        System.out.println("Wypłacanie pieniędzy z konta");
    }
}
