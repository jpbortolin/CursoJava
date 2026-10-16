/*
    --------------- Exercício 3 ---------------

    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma 
    mensagem "São Múltiplos" ou "Não são Múltiplos", indicando se os 
    valores lidos são múltiplos entre si. Atenção: os números devem 
    poder ser digitados em ordem crescente ou decrescente.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.printf("Digite o 1º número inteiro: ");
        a = sc.nextInt();

        System.out.printf("Digite o 2º número inteiro: ");
        b = sc.nextInt();

        System.out.println("");

        if (a % b == 0) {
            System.out.println("São múltiplos");
        }
        else if (b % a == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }        
}