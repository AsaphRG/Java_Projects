/* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de
forma que a variável A passe a possuir ovalor da variável B e a variável B passe
a possuir o valor da variável A.Apresentar osvalores trocados; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor da variável A: ");
        int A = leitor.nextInt();
        System.out.print("Insira o valor da variável B: ");
        int B = leitor.nextInt();
        int aux = A;
        A = B;
        B = aux;
        System.out.println("A variável A está com o valor: " + A);
        System.out.println("A variável B está co mo valor: " + B);
    }
}
