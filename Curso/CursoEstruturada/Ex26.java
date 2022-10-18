/* Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o
usuário digite um número que não esteja neste intervalo, exibir a seguinte
mensagem: número inválido; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = leitor.nextInt();
        if (valor < 0 && valor > 5) {
            System.out.println("Número inválido");
        } else {
            if (valor == 0) {
                System.out.println("Zero");
            } else if (valor == 1) {
                System.out.println("Um");
            } else if (valor == 2) {
                System.out.println("Dois");
            } else if (valor == 3) {
                System.out.println("Três");
            } else if (valor == 4) {
                System.out.println("Quatro");
            } else if (valor == 5) {
                System.out.println("Cinco");
            }
        }
    }
}
