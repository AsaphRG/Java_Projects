/* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações
sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor 
das prestações; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor do produto: ");
        float valor = leitor.nextFloat();
        System.out.print("Insira a quantidade de parcelas: ");
        int par = leitor.nextInt();
        System.out.println("O valor do produto é " + valor + " e serão " + par + ", cada uma no valor de R$" + (valor / par));
    }
}
