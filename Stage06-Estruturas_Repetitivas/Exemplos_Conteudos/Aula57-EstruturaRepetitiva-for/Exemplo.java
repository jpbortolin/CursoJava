/*
    -------------------- Problema Exemplo --------------------

    Fazer um programa que lê um valor inteiro N e depois N números inteiros.
    Ao final, mostra a soma dos N números lidos
*/

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int N = sc.nextInt();

        System.out.println("");

        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite outr valor inteiro: ");
            int x = sc.nextInt();

            soma += x;
        }

        System.out.println("Soma dos valores inteiros digitados: " + soma);

        sc.close();
    }
}
