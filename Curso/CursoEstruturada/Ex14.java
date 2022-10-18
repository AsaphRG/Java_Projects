/* Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é
o maior; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o primeiro valor: ");
        int valor1 = leitor.nextInt();
        System.out.print("Insira o segundo valor: ");
        int valor2 = leitor.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1 + " é maior do que " + valor2);
        } else if (valor2 > valor1) {
            System.out.println(valor2 + " é maior do que " + valor1);
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
