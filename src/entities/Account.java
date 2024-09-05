package entities;

public class Account {
    public final String accountNumber;
    public final String accountHolder;
    private double balance = 0;

    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount + 5.00) {
            this.balance -= (balance - 5.00) - amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public String toString() {
        return "Account " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: $ " + String.format("%.2f", balance);
    }
}
