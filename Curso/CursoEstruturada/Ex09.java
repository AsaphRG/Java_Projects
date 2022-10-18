/* Faça um algoritmo que receba um valor que foi depositado e exiba o valor com 
rendimento após um mês. Considere fixo o juro da poupança em 0,07% a.m; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Valor do depósito: ");
        float dep = leitor.nextFloat();
        System.out.println("O valor de rendimento em um mês é: " + (dep * 0.07));
    }
}
