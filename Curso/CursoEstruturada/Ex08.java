/* Elabore um algoritmo que efetue a apresentação do valor da conversão em real
(R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da 
cotação do dólar e também a quantidade de dólares disponíveis com o usuário; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor da cotação do dólar: ");
        float cot = leitor.nextFloat();
        System.out.print("Insira a quantidade de dólares: ");
        float dol = leitor.nextFloat();
        float real = cot * dol;
        System.out.println("Você tem R$" + real);
    }
}
