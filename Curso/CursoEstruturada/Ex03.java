/* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo 
fornecida a distância total percorrida pelo automóvel e o total de combustível 
gasto; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a distância em quilometros percorrida pelo carro: ");
        float dist = leitor.nextFloat();
        System.out.print("Insira a quantidade de combustível em litros gasta pelo carro: ");
        float combustivel = leitor.nextFloat();
        System.out.println("Seu carro gasta em média " + (dist / combustivel) + "km/l.");
    }
}
