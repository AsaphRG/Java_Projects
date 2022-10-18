/* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas
que ele obteve no semestre. No finalinformar o nome do aluno e a sua média
(aritmética); */
package CursoEstruturada;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.print("Nota do primeiro trimestro: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Nota do segundo trimestre: ");
        float nota2 = leitor.nextFloat();
        System.out.print("Nota do terceiro trimestre: ");
        float nota3 = leitor.nextFloat();
        System.out.println("A média da nota de " + nome + " é " + ((nota1 + nota2 + nota3) / 3));
    }
}
