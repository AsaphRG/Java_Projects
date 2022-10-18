/* A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça
um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o valor
da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula. */
package CursoEstruturada;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nivel;
        float hora;
        System.out.println("Insira o nível do professor: ");
        nivel = leitor.nextInt();
        System.out.println("Insira as horas de aula: ");
        hora = leitor.nextFloat();
        switch (nivel) {
            case 1 -> System.out.println("O salário do professor será de R$" + (hora * 12));
            case 2 -> System.out.println("O salário do professor será de R$" + (hora * 17));
            case 3 -> System.out.println("O salário do professor será de R$" + (hora * 25));
            default -> System.out.println("Nível inválido");
        }
    }
}
