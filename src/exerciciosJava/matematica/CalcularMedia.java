package exerciciosJava.matematica;

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Informe outro número: ");
        double numero2 = scanner.nextDouble();

        double media = (numero2 + numero1) / 2;

        System.out.printf("A média entre %s e %s é: %s", numero1, numero2, media);

        scanner.close();
    }
}
