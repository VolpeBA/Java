package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Insira os dados do aluno: ");
        System.out.println("Nome: ");
        student.name = sc.nextLine();
        System.out.println("Nota 1 trimestre: ");
        student.nota1t = sc.nextDouble();
        System.out.println("Nota 2 trimestre: ");
        student.nota2t = sc.nextDouble();
        System.out.println("Nota 3 trimestre: ");
        student.nota3t = sc.nextDouble();

        System.out.println(student);
        sc.close();
    }
}
