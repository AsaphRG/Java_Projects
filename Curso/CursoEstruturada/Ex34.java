/* Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma
das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não
contemplado; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria infantil A");
        } else if (idade <= 10) {
            System.out.println("Categoria infantil B");
        } else if (idade <= 13) {
            System.out.println("Categoria juvenil A");
        } else if (idade <= 17) {
            System.out.println("Categoria juvenil B");
        } else if (idade <= 25) {
            System.out.println("Categoria sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
        }
    }
}
