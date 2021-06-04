package Odwiedzajacy;

import java.util.ArrayList;
import java.util.List;

public class TestCustomerVisitor {

    public static void main(String[] args) {

        CustomerVisitor visitor = new CustomerVisitorImpl();
        List<Customer> customers = newCustomers();

        for(Customer currCustomer : customers){
            System.out.println(currCustomer.accept(visitor));
        }

    }

    private static List<Customer> newCustomers(){
        List<Customer> customers = new ArrayList<>();

        customers.add(new NormalCustomer("Andrzej"));
        customers.add(new NormalCustomer("Rafał"));
        customers.add(new VipCustomer("Michał"));
        customers.add(new VipCustomer("Ania"));
        customers.add(new NormalCustomer("Beata"));

        return customers;
    }
}
