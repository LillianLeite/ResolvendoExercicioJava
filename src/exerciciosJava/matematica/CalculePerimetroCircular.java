package exerciciosJava.matematica;

import java.util.Scanner;

public class CalculePerimetroCircular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O preímetro do círculo é: " + perimetro);

        scanner.close();
    }
}
