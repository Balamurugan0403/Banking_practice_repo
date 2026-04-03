package loanmanagement;

public class Loan {

    int loanId;
    String name;
    double amount;

    public Loan(int loanId, String name, double amount) {
        this.loanId = loanId;
        this.name = name;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Customer Name: " + name);
        System.out.println("Loan Amount: " + amount);
    }
}