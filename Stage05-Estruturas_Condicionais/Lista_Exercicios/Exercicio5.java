/*
    --------------- Exercício 5 ---------------

    Com base na tabela abaixo, escreva um programa que leia o código de 
    um item e a quantidade deste item. A seguir, calcule e mostre o 
    valor da conta a pagar.

    | CÓDIGO |  ESPECIFICAÇÃO  |  PREÇO  |
    | ------ | --------------- | ------- |
    |   1    | Cachorro Quente | R$ 4.00 |
    |   2    |     X-Salada    | R$ 4.50 |
    |   3    |     X-Bacon     | R$ 5.00 |
    |   4    | Torrada Simples | R$ 2.00 |
    |   5    |   Refrigerante  | R$ 1.50 |
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        System.out.println("Bem-Vindo a lanchonete JavaBurguer's");
        System.out.println("");
        
        System.out.println("| CÓDIGO |  ESPECIFICAÇÃO  |  PREÇO  |");
        System.out.println("| ------ | --------------- | ------- |");
        System.out.println("|   1    | Cachorro Quente | R$ 4.00 |");
        System.out.println("|   2    |     X-Salada    | R$ 4.50 |");
        System.out.println("|   3    |     X-Bacon     | R$ 5.00 |");
        System.out.println("|   4    | Torrada Simples | R$ 2.00 |");
        System.out.println("|   5    |   Refrigerante  | R$ 1.50 |");

        System.out.println("");

        System.out.print("Digite o código do item que você deseja: ");
        codigo = sc.nextInt();

        System.out.print("Digite a quantidade do item escolhido: ");
        quantidade = sc.nextInt();

        System.out.println("");

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.printf("Valor total: R$ %.2f\n", total);
        }
        else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.printf("Valor total: R$ %.2f\n", total);
        }
        else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.printf("Valor total: R$ %.2f\n", total);
        }
        else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.printf("Valor total: R$ %.2f\n", total);
        }
        else if (codigo == 5) {
            total = quantidade * 1.50;
            System.out.printf("Valor total: R$ %.2f\n", total);
        }

        sc.close();
    }
}
