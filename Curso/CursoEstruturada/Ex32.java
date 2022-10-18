/* Escreva um algoritmo que leia três valores inteiros e verifique se eles podem
ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que
eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de
cada lado de um triângulo é menor do que a soma dos comprimentos dos outros
dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes; */
package CursoEstruturada;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A, B, C;
        System.out.println("Insira o lado A: ");
        A = leitor.nextInt();
        System.out.println("Insira o lado B: ");
        B = leitor.nextInt();
        System.out.println("Insira o lado C: ");
        C = leitor.nextInt();
        if (A == B && B == C) {
            System.out.println("Esse é um triângulo equilátero");
        } else if ((A != B && A == C) || (A == B && A != C)) {
            System.out.println("Esse é um triãngulo isóscele");
        } else if (A != B && B != C) {
            System.out.println("Esse é um triângulo Escaleno");
        }
    }
}
