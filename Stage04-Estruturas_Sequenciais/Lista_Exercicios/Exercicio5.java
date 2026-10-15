/*
    --------------- Exercício 5 ---------------

    Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
    o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
    e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id1, id2, nPecas1, nPecas2;
        double valorUnit1, valorUnit2, totalPagar;

        System.out.println("Digite o código da peça, a quantidade e o seu valor unitário, respectivamente (Ex: 12 5 5.50): ");
        id1 = sc.nextInt();
        nPecas1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();

        System.out.println("Digite o código da próxima peça, a quantidade e o seu valor unitário, respectivamente (Ex: 12 5 5.50): ");
        id2 = sc.nextInt();
        nPecas2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();

        totalPagar = (nPecas1 * valorUnit1) + (nPecas2 * valorUnit2);

        System.out.println("");
        System.out.printf("O valor totala pagar é R$ %.2f\n", totalPagar);

        sc.close();
    }
}