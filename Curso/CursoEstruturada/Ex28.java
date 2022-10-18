/* Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584
funcionários de acordo com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.
Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o
seu novo salário reajustado. Escrever o nome do funcionário, o reajuste e seu
novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento;*/
package CursoEstruturada;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float sal, salMin, salNovo;
        float custoEmp = 0;
        float custoEmpNovo = 0;
        String nome;
        System.out.println("Insira o valor do salário mínimo: ");
        salMin = leitor.nextFloat();
        for (int i = 0; i < 584; i++) {
            System.out.println("Insira o nome do funcionário: ");
            nome = leitor.nextLine();
            System.out.println("Insira o valor do salário: ");
            sal = leitor.nextFloat();
            if (sal / salMin <= 3) {
                salNovo = sal + (sal * 0.5f);
            } else if (sal / salMin <= 10) {
                salNovo = sal + (sal * 0.2f);
            } else if (sal / salMin <= 20) {
                salNovo = sal + (sal * 0.15f);
            } else {
                salNovo = sal + (sal * 0.1f);
            }
            custoEmp = custoEmp + sal;
            custoEmpNovo = custoEmpNovo + salNovo;
            System.out.println("O salário de " + nome + "será reajustado em R$" + (salNovo - sal) + " e passará a receber R$" + salNovo);
        }
        System.out.println("O valor total antes do ajuste era de R$" + custoEmp);
        System.out.println("O valor total com o ajuste ficará R$" + custoEmpNovo);
        System.out.println("A folha de pagamento ficará R$" + (custoEmp - custoEmpNovo) + " mais cara.");
    }
}
