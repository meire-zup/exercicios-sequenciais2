import java.util.Scanner;

public class Exercicio6 {
    /*
    Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int numeroInteiro = scanner.nextInt();
        int antecessor = numeroInteiro-1;
        int sucessor = numeroInteiro+1;
        System.out.printf("O antecessor do número %d é %d e o seu sucessor é %d", numeroInteiro,antecessor,sucessor);
    }
}
