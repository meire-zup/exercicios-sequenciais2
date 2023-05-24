import java.util.Scanner;

public class Exercicio4 {
    /*
    Faça um Programa que recebe o quanto você ganha por hora e o
    número de horas trabalhadas no mês. Calcule e mostre o total
    do seu salário no referido mês.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe valor da hora trabalhada:");
        double valorDaHoraTrabalhada = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int quantidadeDeHorasTrabalhadas = scanner.nextInt();

        double salarioTotal = valorDaHoraTrabalhada * quantidadeDeHorasTrabalhadas;
        System.out.printf("O seu salário mensal é de R$ %.2f",salarioTotal);

    }
}
