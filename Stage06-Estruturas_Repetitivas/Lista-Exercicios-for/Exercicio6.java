/* 
    ---------------- Exercício 6 ----------------

    Ler um número inteiro N e calcular todos os seus divisores.

*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        System.out.println("");

        System.out.println("Divisores de " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
