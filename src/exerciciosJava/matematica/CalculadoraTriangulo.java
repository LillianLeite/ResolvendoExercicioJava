package exerciciosJava.matematica;

import java.util.Scanner;

public class CalculadoraTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o lado a do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Informe o lado b do trângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.println("Informe a lado c do triângulo: ");
        double ladoC = scanner.nextDouble();

        System.out.println("Informe a altura h ralativa ao lado do triângulo: ");
        double altura = scanner.nextDouble();

        double perimetro = ladoA + ladoB + ladoC;
        double area = (ladoB * altura) / 2;

        System.out.println("O perímetro do triângulo é: " + perimetro);
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
