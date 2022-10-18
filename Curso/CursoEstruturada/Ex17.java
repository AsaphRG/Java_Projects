/* Leia 80 números e ao final informar quantos número(s) está(ão) no intervalo
entre 10 (inclusive) e 150 (inclusive); */
package CursoEstruturada;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int[] lista = new int[80];
        int qtdnum = 0;
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 80; i++) {
            System.out.print("Insira um valor: ");
            lista[i] = leitor.nextInt();
        }
        for (int i = 0; i < 80; i++) {
            if (lista[i] >= 10 && lista[i] <= 150) {
                qtdnum++;
            }
        }
        System.out.print(qtdnum + " números são maiores que 10 e menores que 150");
    }
}
