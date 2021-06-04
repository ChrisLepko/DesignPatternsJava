package Odwiedzajacy;

public interface CustomerVisitor {
    String visit(NormalCustomer normalCustomer, String firstName);
    String visit(VipCustomer vipCustomer, String firstName);
}
