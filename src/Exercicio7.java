import java.util.Scanner;

public class Exercicio7 {
    /*
    Faça um Programa que receba o quanto você ganha por hora e o
    número de horas trabalhadas no mês. Calcule e mostre o total
    do seu salário no referido mês, sabendo-se que são descontados
    11% para o Imposto de Renda, 8% para o INSS e 5% para o
    sindicato, faça um programa que nos dê respectivamente:
    - Salário bruto.
    - Quanto pagou ao INSS.
    - Quanto pagou ao sindicato.
    - Qual o salário líquido do funcionário.
     */
    public static void main(String[] args) {
        double salarioBruto = salarioBase();
        double taxaImpostoDeRenda = 11;
        double descontoImpostoDeRenda = salarioBruto*(taxaImpostoDeRenda/100);
        double taxaInss = 8;
        double descontoInss = salarioBruto * (taxaInss/100);
        double taxaSindicato = 5;
        double descontoSindicato = salarioBruto * (taxaSindicato/100);
        double salarioLiquido = salarioBruto-descontoInss-descontoSindicato-descontoImpostoDeRenda;
        System.out.println("-------------------------------------");
        System.out.println("Relatório salarial");
        System.out.printf("Salário bruto: R$ %.2f\n",salarioBruto);
        System.out.printf("Desconto Imposto de renda: R$ %.2f\n",descontoImpostoDeRenda);
        System.out.printf("Desconto INSS: R$ %.2f\n",descontoInss);
        System.out.printf("Desconto Sindicato: R$ %.2f\n",descontoSindicato);
        System.out.printf("Salário líquido: R$ %.2f\n",salarioLiquido);
        System.out.println("-------------------------------------");

    }
    public static Double salarioBase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe valor da hora trabalhada:");
        double valorDaHoraTrabalhada = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        int quantidadeDeHorasTrabalhadas = scanner.nextInt();
        return valorDaHoraTrabalhada * quantidadeDeHorasTrabalhadas;

    }
}
