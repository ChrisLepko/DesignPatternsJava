package Odwiedzajacy;

public class NormalCustomer implements Customer {

    private String firstName;

    public NormalCustomer(String firstName) {
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
