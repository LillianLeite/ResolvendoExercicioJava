package exerciciosJava.matematica;

import java.util.Scanner;

public class CalculeRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.println("Informe o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
