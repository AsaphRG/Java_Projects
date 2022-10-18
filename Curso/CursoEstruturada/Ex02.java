/* Faça um algoritmo que receba dois números e ao final mostre a soma, 
subtração, multiplicação e a divisão dos dois números lidos; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        float valor1 = leitor.nextFloat();
        System.out.print("Insira outro valor: ");
        float valor2 = leitor.nextFloat();
        float soma = valor1 + valor2;
        float subtracao = valor1 - valor2;
        float multiplicacao = valor1 * valor2;
        float divisao = valor1 / valor2;
        System.out.println("A soma é " + soma + ", a subtração é " + subtracao + ", a multiplicação é " + multiplicacao + " e a dividão é " + divisao);
    }
}
