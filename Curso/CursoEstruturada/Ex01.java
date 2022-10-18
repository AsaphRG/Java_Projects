/* Faça um algoritmo que receba dois números e exiba o resultado da sua soma; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int valor1 = leitor.nextInt();
        System.out.print("Insira outro número: ");
        int valor2 = leitor.nextInt();
        System.out.println("O resultado da soma é: " + (valor1 + valor2));
    }
}
