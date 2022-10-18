/* Faça um algoritmo que receba o preço de custo de um produto e mostre o valor 
de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um 
percentual informado pelo usuário; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de custo do produto: ");
        float valor = leitor.nextFloat();
        System.out.print("Insira a porcentagem de lucro: ");
        float pc = leitor.nextFloat();
        System.out.println(pc + "% de lucro dá R$" + (valor * pc / 100));
        System.out.println("O valor final do produto será R$" + (valor + (valor * pc / 100)));
    }
}
