/*
    --------------- Exercício 1 ---------------

    Faça um programa para ler dois valores inteiros, e depois 
    mostrar na tela a soma desses números com uma
    mensagem explicativa.
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, resultado;

        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        System.out.println("");

        resultado = a + b;
        System.out.println("Soma dos valores: " + resultado);

        sc.close();
    }
}