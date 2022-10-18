/* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus
Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em
Fahrenheit e C a temperatura em Celsius;*/
package CursoEstruturada;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos ºC está hoje?");
        int celsius = leitor.nextInt();
        float fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Isso dá " + fahrenheit + "ºF");
    }
}
