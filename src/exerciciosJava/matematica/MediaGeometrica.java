package exerciciosJava.matematica;

import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double mediaGeometrica = Math.pow(numero1 * numero2 * numero3, 1.0/3.0);

        System.out.println("A média geométrica dos números é: " + mediaGeometrica);

        scanner.close();
    }
}
