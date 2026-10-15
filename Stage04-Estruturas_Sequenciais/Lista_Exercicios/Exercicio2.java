/*
    --------------- Exercício 2 ---------------

    Faça um programa para ler o valor do raio de um círculo, e depois 
    mostrar o valor da área deste círculo com quatro casas decimais.

    Considere:
    - Fórmula da área: area = π . raio²
    - Considere o valor de π = 3.14159
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, raio;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();
        System.out.println("");

        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("O valor da área é %.4f\n", area);

        sc.close();
    }
}