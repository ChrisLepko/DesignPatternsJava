package Odwiedzajacy;

public class VipCustomer implements Customer {

    private String firstName;

    public VipCustomer(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String accept(CustomerVisitor visitor) {
        return visitor.visit(this, firstName);
    }
}
