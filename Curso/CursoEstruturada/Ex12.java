/* O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o
percentual do distribuidor e dos impostos aplicados (primeiro os impostos são
aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre
o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
custo ao consumidor do mesmo; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de custo do carro: ");
        double custo = leitor.nextDouble();
        double valor = (custo * 0.28) * 0.45;
        System.out.println("O valor do carro para o cliente final é R$" + valor);
    }
}
