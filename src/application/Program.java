package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char chooseInitialDeposit = sc.nextLine().toLowerCase().charAt(0);

        Account account = new Account(accountNumber, accountHolder);

        if (chooseInitialDeposit == 'y') {
            System.out.println("Enter a initial deposit amount: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        }

        System.out.println("Updated account data: \n" + account);

        System.out.println("Enter a deposit value: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Updated account data: \n" + account);

        System.out.println("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Updated account data: \n" + account);

        sc.close();
    }
}