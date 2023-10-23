package exerciciosJava.matematica;

import java.util.Scanner;

public class CalculeDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Informe o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Informe o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O valor de delta é: " + delta);

        scanner.close();
    }
}
