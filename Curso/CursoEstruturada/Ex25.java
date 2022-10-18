/* Faça um algoritmo que leia dois números e identifique se são iguais ou
diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são
iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem que
são diferentes; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        System.out.println("Insira o primeiro valor: ");
        valor1 = leitor.nextInt();
        System.out.println("Insira o segundo valor: ");
        valor2 = leitor.nextInt();
        if (valor1 == valor2) {
            System.out.println("Os valores são iguais");
        } else if (valor1 > valor2) {
            System.out.println("Os valores são diferentes");
            System.out.println("O primeiro valor é maior");
        } else {
            System.out.println("Os valores são diferentes");
            System.out.println("O segundo valor é maior");
        }
    }
}
