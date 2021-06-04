package Odwiedzajacy;

public class CustomerVisitorImpl implements CustomerVisitor {


    @Override
    public String visit(NormalCustomer normalCustomer, String firstName) {
        return "Wiadomość powitalna wysłana do: " + firstName + " - nowego zwykłego klienta";
    }

    @Override
    public String visit(VipCustomer vipCustomer, String firstName) {
        return "Wiadomość powitalna wysłana do: " + firstName + " - nowego klienta VIP";
    }
}
