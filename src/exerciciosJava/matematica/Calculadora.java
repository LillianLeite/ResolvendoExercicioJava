package exerciciosJava.matematica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Informe outro número: ");
        double numero2 = scanner.nextDouble();

        System.out.printf("A soma entre %s e %s é: %s \n", numero1, numero2, numero1 + numero2);
        System.out.printf("A subtração entre %s e %s é: %s \n", numero1, numero2, numero1 - numero2);
        System.out.printf("A mutiplicação entre %s e %s é: %s \n", numero1, numero2, numero1 * numero2);
        System.out.printf("A divisão entre %s e %s é: %s \n", numero1, numero2, numero1 / numero2);

        scanner.close();

    }
}
