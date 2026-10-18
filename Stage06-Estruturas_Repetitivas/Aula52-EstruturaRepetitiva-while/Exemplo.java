/*
    -------------------- Problema Exemplo --------------------

    Fazer um programa que lê números inteiros até que um zero seja lido. 
    Ao final mostra a soma dos números lidos.
*/

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite valores aleatórios (0 finaliza o programaa):");
        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println("A soma dos números digitados foi: " + soma);

        sc.close();
    }
}
