/*
    --------------- Exercício 1 ---------------

    Fazer um programa para ler um número inteiro, e depois 
    dizer se este número é negativo ou não.
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.printf("Digite um número inteiro: ");
        x = sc.nextInt();

        System.out.println("");

        if (x < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não negativo");
        }

        sc.close();
    }
}