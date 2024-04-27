package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the name of the employee: ");
        employee.name = sc.nextLine();

        System.out.println("Enter the gross salary of the employee: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Enter the tax of the employee: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
