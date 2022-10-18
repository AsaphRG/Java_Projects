/* Faça um algoritmo que receba um número e diga se este número está no 
intervalo entre 100 e 200; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int valor = leitor.nextInt();
        if (valor > 99 && valor < 201) {
            System.out.println("O número está dentro do intervalo");
        }
        else {
            System.out.println("O número não está dentro do intervalo");
        }
    }
}
