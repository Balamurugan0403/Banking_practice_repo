package loanmanagement;

public class Customer {

    int customerId;
    String customerName;
    String city;

    public Customer(int customerId, String customerName, String city) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("City: " + city);
    }
}