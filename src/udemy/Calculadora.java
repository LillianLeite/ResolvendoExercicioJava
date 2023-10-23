package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
        System.out.println("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Qual operação você deseja realizar?");
        System.out.println("Digite: \n [1] para somar. \n [2] para subtrair. \n [3] para dividir." +
                "\n [4] para saber se a divisão é exata.");
        double operacao = scanner.nextDouble();

        scanner.close();

        if (operacao == 1) {
            System.out.printf("O resultado da soma é: %s", num1 + num2);
        }

        if (operacao == 2) {
            System.out.printf("O resultado da subtração é: %S", num1 - num2);
        }

        if (operacao == 3) {
            System.out.printf("O resultado da divisão é: %S",num1 / num2);
        }

        if (operacao == 4) {
            System.out.printf("Restará: %S", num1 % num2);
        }
        if(operacao > 4) {
            System.out.println("Número inválido");
        }
    }
}
