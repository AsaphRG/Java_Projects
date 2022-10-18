/* Faça um algoritmo que receba a idade de 75 pessoas e mostre uma mensagem
informando “maior de idade” e “menor de idade” para cada pessoa. Considere a 
idade a partir de 18 anos como maior de idade; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] idades = new int[80];
        for (int i = 0; i < 75; i++) {
            System.out.print("Insira idade: ");
            idades[i] = leitor.nextInt();
            if (idades[i] > 17) {
                System.out.print("Maior de idade");
            } else {
                System.out.print("Menor de idade");
            }
        }
    }
}
