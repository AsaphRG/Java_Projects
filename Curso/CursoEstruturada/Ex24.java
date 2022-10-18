/* Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero
para cada número; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor = 0;
        while (true) {
            System.out.println("Insira um valor (0 para encerrar): ");
            valor = leitor.nextInt();
            if (valor == 0) {
                System.out.println("Valor igual a 0");
                break;
            } else if (valor > 0) {
                System.out.println("Valor positivo");
            } else {
                System.out.println("Valor negativo");
            }
        }
    }
}
