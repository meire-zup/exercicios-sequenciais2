import java.util.Scanner;

public class Exercicio5 {
    /*
    Faça um programa que peça a temperatura em graus Fahrenheit,
    transforme e mostre a temperatura em graus Celsius.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit:");
        int temperaturaEmFahrenheit = scanner.nextInt();
        int temperaturaEmCelsius = (int) ((5 * Math.round(temperaturaEmFahrenheit-32))/9);
        System.out.println("A temperatura em graus Celsius é de "+temperaturaEmCelsius+" C");


    }
}
