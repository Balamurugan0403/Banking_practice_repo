package loanmanagement;

public class Main{

    public static void main(String[] args) {

        Loan l1 = new Loan(1, "Bala", 10000);
        Customer c1 = new Customer(201, "gurujithan", "Chennai");
        c1.displayCustomer();

        l1.display();
    }
}