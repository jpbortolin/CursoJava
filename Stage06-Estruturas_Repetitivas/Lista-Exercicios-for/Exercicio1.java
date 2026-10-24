/* 
    ---------------- Exercício 1 ----------------

    Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um 
    valor por linha, inclusive o X, se for o caso.

*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro (entre 1 à 1000): ");
        int x = sc.nextInt();

        System.out.println("");

        System.out.println("Os valores ímpares nesse intervalo são:");

        for (int i = 1; i <= x; i++) { 

            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
