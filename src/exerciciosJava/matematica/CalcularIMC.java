package exerciciosJava.matematica;

import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é: " + imc);

        scanner.close();
    }
}
