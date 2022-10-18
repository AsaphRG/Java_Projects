/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número
seja maior que 10; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("Insira um número inteiro: ");
       int num = leitor.nextInt();
       if (num > 10) {
           System.out.println("Esse número é maior que 10");
       } else {
           System.out.println("Esse número não é maior que 10");
       }
    }
}
