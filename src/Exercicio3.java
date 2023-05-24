import java.util.Scanner;

public class Exercicio3 {
    /*
    Faça um programa que converta metros para centímetros.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor em metros:");
        double valorEmMetros = scanner.nextDouble();
        double valorEmCentimetros = valorEmMetros * 100;
        System.out.printf("Valor em cm: %.2f cm",valorEmCentimetros);
    }
}
