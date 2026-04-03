package loanmanagement;

public class Main {

    public static void main(String[] args) {

        Loan l1 = new Loan(1, "Bala", 10000);
        Customer c1 = new Customer(201, "Gurujithan", "Chennai");

        System.out.println("----- Customer Details -----");
        c1.displayCustomer();

        System.out.println("----- Loan Details -----");
        l1.display();
    }
}