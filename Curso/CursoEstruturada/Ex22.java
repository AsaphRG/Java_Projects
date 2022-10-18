/* Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
produtos. Mostre como resultado se houve lucro, prejuízo ou empate para cada 
produto. Informe o valor de custo de cada produto, o valor de venda de cada 
produto, a média de preço de custo e do preço de venda; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float custo, venda, custoTotal, vendaTotal, produtos;
        custoTotal = vendaTotal = produtos = 0;
        for (int i = 0; i < 40; i++) {
            System.out.println("Insira o custo do produto: ");
            custo = leitor.nextFloat();
            System.out.println("Insira o valor de venda do produto: ");
            venda = leitor.nextFloat();
            if (custo > venda) {
                System.out.println("Esse produto dará prejuízo de R$" + (custo - venda));
            } else if (custo == venda) {
                System.out.println("O preço de custo está igual ao de venda");
            } else {
                System.out.println("Esse produto dará um lucro de R$" + (venda - custo));
            }
            custoTotal = custoTotal + custo;
            vendaTotal = vendaTotal + venda;
            produtos++;
        }
        System.out.println("O valor de custo médio é R$" + (custoTotal / produtos));
        System.out.println("O valor de venda médio é R$" + (vendaTotal / produtos));
    }
}
