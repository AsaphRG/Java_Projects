/* Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome 
e se ela é homem ou mulher. No final informe total de homens e de mulheres; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[56];
        char[] sexo = new char[56];
        int qtdh = 0;
        int qtdm = 0;
        for (int i = 0; i < 56; i++) {
            System.out.print("Insira o nome: ");
            nomes[i] = leitor.nextLine();
            System.out.print("Insira sexo (Homem ou Mulher): ");
            sexo[i] = leitor.nextLine().charAt(0);
        }
        for (int i = 0; i < 56; i++) {
            System.out.println("Nome: " + nomes[i] + " | Sexo: " + sexo[i]);
            if (sexo[i] == 'h' || sexo[i] == 'H') {
                qtdh++;
            } else if (sexo[i] == 'm' || sexo[i] == 'M') {
                qtdm++;
            }
        }
        System.out.print("São " + qtdh + " homens e " + qtdm + " mulheres.");
    }
}
