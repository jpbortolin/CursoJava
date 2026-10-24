/* 
    ---------------- Exercício 4 ----------------

    Fazer um programa para ler um número N. Depois leia N pares de números 
    e mostre a divisão do primeiro pelo segundo. Se o denominador for igual 
    a zero, mostrar a mensagem "divisao impossivel".

*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        System.out.println("");

        for (int i = 0; i < n ; i++) {
            System.out.print("Digite o primeiro número: ");
            double x = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            double y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível");
                System.out.println("");
            }
            else {
                double divisao = x / y;
                
                System.out.printf(x + " / " + y + " = %.1f\n", divisao);
                System.out.println("");
            }
        }

        sc.close();
    }
}
