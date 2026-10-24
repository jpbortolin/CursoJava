/* 
    ---------------- Exercício 3 ----------------

    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada 
    caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente 
    a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor 
    tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int x = sc.nextInt();

        System.out.println("");

        for (int i = 0 ; i < x ; i++) {
            System.out.print("Digite o valor 1: ");
            double valor1 = sc.nextDouble();
            
            System.out.print("Digite o valor 2: ");
            double valor2 = sc.nextDouble();

            System.out.print("Digite o valor 3: ");
            double valor3 = sc.nextDouble();

            double media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;

            System.out.printf("Média = %.1f\n", media);
            System.out.println("");
        }

        sc.close();
    }
}
