/* A concessionária de veículos “CARANGO” está vendendo os seus veículos com
desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a
ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo
de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com
valor do veículo zero encerra entrada de dados. Informe total de desconto e
total pago pelos clientes; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float valor;
        float valorTotal = 0.0f;
        float descontoTotal = 0.0f;
        float desconto = 0.0f;
        String comb;
        while (true) {
            System.out.println("Insira o valor do veículo (0 encerra o programa): ");
            valor = leitor.nextFloat();
            System.out.println("Insira o combustível do carro: ");
            comb = leitor.nextLine();
            switch (comb) {
                case "Álcool", "álcool", "alcool", "Alcool" -> {
                    desconto = valor * 0.25f;
                }
                case "Gasolina", "gasolina" -> {
                    desconto = valor * 0.21f;
                }
                case "Diesel", "diesel" -> {
                    desconto = valor * 0.14f;
                }
                default -> {
                    System.out.println("Não há carros que usem esse combustóvel na concessionária.");
                }
            }
            if (valor == 0) {
                break;
            }
            valorTotal = valorTotal + valor;
            descontoTotal = descontoTotal + desconto;
            System.out.println("O valor do desconto é de R$" + desconto + " e o valor final é R$" + (valor - desconto));
        }
        System.out.println("O total de vendas foi R$" + valorTotal + " e o total de desconto foi R$" + descontoTotal);
    }
}
