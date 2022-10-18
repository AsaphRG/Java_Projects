/* Escreva um algoritmo que leia três valores inteiros distintos e os escreva em
ordem crescente; 

BUBLE SORT*/
package CursoEstruturada;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] lista = new int[3];
        int aux;
        lista[0] = leitor.nextInt();
        lista[1] = leitor.nextInt();
        lista[2] = leitor.nextInt();
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }
}
