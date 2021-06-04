package Pełnomocnik;

public class BankAccountProxy implements IBankAccount {

    private BankAccount bankAccount;
    private Consumer consumer;

    public BankAccountProxy(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void cashOut() {
        if(consumer.getEmail().equalsIgnoreCase("jakisTestowyEmail@op.pl") && consumer.getPassword().equalsIgnoreCase("zaq1@WSX")){
            bankAccount = new BankAccount();
            bankAccount.cashOut();
        } else {
            System.out.println("Brak dostępu do konta! Niepoprawne dane!");
        }
    }
}
