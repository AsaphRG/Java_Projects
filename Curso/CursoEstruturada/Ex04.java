/* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
o salário fixo e salário no final do mês; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o nome do vendedor: ");
        String nome = leitor.nextLine();
        System.out.print("Insira o salário fixo do vendedor: ");
        float fsal = leitor.nextFloat();
        System.out.print("Insira o valor das vendas pelo vendedor no mês: ");
        float venda = leitor.nextFloat();
        System.out.println("O salário de " + nome + " é R$" + fsal + ", ele vendeu R$" + venda + ". Com uma bonificação de 15% ele receberá R$" + (venda*15/100) + " e irá ganhar R$" + (fsal + (venda*15/100)) + " no mês.");
    }
}
