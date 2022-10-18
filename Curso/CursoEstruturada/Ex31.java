/* Dados três valores A, B e C, em que A e B são números reais e C é um 
caractere, pede-se para imprimir o resultado da operação de A por B se C for um
símbolo de operador aritmético; caso contrário deve ser impressa uma mensagem de
operador não definido. Tratar erro de divisão por zero; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float A, B;
        char C;
        System.out.println("Insira um número: ");
        A = leitor.nextInt();
        System.out.println("Insira outro número: ");
        B = leitor.nextInt();
        System.out.println("Insira um operador: ");
        C = leitor.nextLine().charAt(0);
        if (A == 0 || B == 0 && C == '/') {
            System.out.println("Operação impossível");
        } else {
            switch (C) {
                case '+' -> System.out.println("O resultado da operação é " + (A + B));
                case '-' -> System.out.println("O resultado da operação é " + (A - B));
                case '/' -> System.out.println("O resultado da operação é " + (A / B));
                case '*' -> System.out.println("O resultado da operação é " + (A * B));
                default -> System.out.println("Operador inválido");
            }
        }
    }
}
