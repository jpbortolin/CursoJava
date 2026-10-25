/* 
    ---------------- Exercício 6 ----------------

    Fazer um programa para ler um número inteiro positivo N. O programa deve 
    então mostrar na tela N linhas, começando de 1 até N. Para cada linha, 
    mostrar o número da linha, depois o quadrado e o cubo do valor.

*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = sc.nextInt();

        System.out.println("");

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
        }

        sc.close();
    }
}
