/* Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre
5.1 a 6.9); */
package CursoEstruturada;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.print("Insira a nota da prova 1: ");
        float prova1 = leitor.nextFloat();
        System.out.print("Insira a nota da prova 2: ");
        float prova2 = leitor.nextFloat();
        System.out.print("Insira a nota da prova 3: ");
        float prova3 = leitor.nextFloat();
        float media = (prova1 + prova2 + prova3) / 3;
        if (media >= 7) {
            System.out.print("O aluno " + nome + " está aprovado.");
        } else if (media <= 5) {
            System.out.print("O aluno " + nome + " está reprovado.");
        } else {
            System.out.print("O aluno " + nome + "está de recuperação.");
        }
    }
}
