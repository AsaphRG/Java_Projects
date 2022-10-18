/* Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se
que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29. */
package CursoEstruturada;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String cliente;
        float hora;
        System.out.println("Insira o tipo de cliente: ");
        cliente = leitor.nextLine();
        System.out.println("Insira o tempo de uso do aparelho: ");
        hora = leitor.nextFloat();
        switch (cliente) {
            case "Residência" -> System.out.println("O valor da conta será de R$" + (hora * 0.6));
            case "Comércio" -> System.out.println("O valor da conta será de R$" + (hora * 0.48));
            case "Indústria" -> System.out.println("O valor da conta será de R$" + (hora * 1.29));
        }
    }
}
