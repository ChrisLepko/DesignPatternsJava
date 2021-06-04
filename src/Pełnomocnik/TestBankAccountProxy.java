package Pełnomocnik;

public class TestBankAccountProxy {
    public static void main(String[] args) {
        Consumer consumerCorrect = new Consumer("jakisTestowyEmail@op.pl", "zaq1@WSX");
        Consumer consumerInCorrect = new Consumer("niepoprawnyEmail@op.pl", "123456");


        BankAccountProxy bankAccountProxyCorrect = new BankAccountProxy(consumerCorrect);
        bankAccountProxyCorrect.cashOut();

        BankAccountProxy bankAccountProxyInCorrect = new BankAccountProxy(consumerInCorrect);
        bankAccountProxyInCorrect.cashOut();


    }
}
