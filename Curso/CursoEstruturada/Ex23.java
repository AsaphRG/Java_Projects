/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número
seja maior que 80, menor que 25 ou igual a 40; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float valor = leitor.nextFloat();
        if (valor > 80) {
            System.out.println("Valor maior que 80");
        } else if (valor > 25) {
            System.out.println("Valor menor que 25");
        } else if (valor == 40) {
            System.out.println("Valor igual a 40");
        }
    }
}
