/*
    -------------------- Problema Exemplo --------------------

    Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente 
    em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário 
    digite "s", repetir o programa.

    Fórmula: 
    
    F = ((9 * c) / 5) + 32
*/

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resposta;
        
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();

            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f\n\n", F);

            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
            System.out.println("");

        } while (resposta != 'n');

        sc.close();
    }
}
