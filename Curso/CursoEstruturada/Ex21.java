/* Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e
saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório.
Informe os totais;*/
package CursoEstruturada;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int pessoas = 0;
        int idade;
        char sexo;
        int homem = 0;
        int mulher = 0;
        char saude;
        int aptos = 0;
        int inaptos = 0;
        char esc;
        while (true) {
            System.out.print("Insira o nome: ");
            nome = leitor.nextLine();
            System.out.print("Insira o sexo [H/M]: ");
            sexo = leitor.nextLine().charAt(0);
            System.out.print("Insira a idade: ");
            idade = leitor.nextInt();
            System.out.print("Insira o estado de saúde [Boa - Ruim]: ");
            saude = leitor.nextLine().charAt(0);
            if (idade > 17 && saude == 'b' || saude == 'B') {
                System.out.println(nome + " está apto(a) para servir.");
            } else {
                System.out.println(nome + " não está apto(a) para servir.");
            }
            pessoas++;
            if (sexo == 'h' || sexo == 'H') {
                homem++;
            } else {
                mulher++;
            }
            if (saude == 'b' || saude == 'B') {
                aptos++;
            } else {
                inaptos++;
            }
            System.out.print("Deseja inserir outro número? [S/N] ");
            esc = leitor.nextLine().charAt(0);
            if (esc == 'n' || esc == 'N') {
                break;
            }
        }
        System.out.println("Ao todo foram cadastradas " + pessoas + " pessoas.");
        System.out.println("Dessas haviam " + homem + " homens e " + mulher + " mulheres.");
        System.out.println(aptos + " eram aptos e " + inaptos + " eram inaptos.");
    }
}
