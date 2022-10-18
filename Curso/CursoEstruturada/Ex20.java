/* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos 
com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o 
valor a ser pago pelo cliente de vários carros. O desconto deverá ser calculado
de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema 
deverá perguntar se deseja continuar calculando desconto até que a resposta 
seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int carrosVelhos = 0;
        int carros = 0;
        float desconto;
        char esc;
        while (true) {
            System.out.print("Issira o ano do carro: ");
            int ano = leitor.nextInt();
            System.out.print("Insira o valor do carro: ");
            float valor = leitor.nextFloat();
            if (ano > 2000) {
                desconto = valor * 0.07f;
            } else {
                desconto = valor * 0.12f;
                carrosVelhos++;
            }
            carros++;
            System.out.println("O valor do carro é R$" + valor + " e o desconto é de R$" + desconto + ", sendo o valor final R$" + (valor - desconto) + ".");
            System.out.print("Deseja inserir outro carro? [S/N]");
            esc = leitor.nextLine().charAt(0);
            if (esc == 'n' || esc == 'N') {
                break;
            }
        }
        System.out.println("O total de carros vendidos foi " + carros + " e o total de carros antigos foi " + carrosVelhos);
    }
}
