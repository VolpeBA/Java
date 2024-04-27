import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        // Lê o valor do raio
        double raio = scanner.nextDouble();

        // Calcula a área da circunferência
        double area = pi * raio * raio;

        // Exibe o resultado com 4 casas decimais
        System.out.printf("A=%.4f/n", area);

        scanner.close();
    }
}