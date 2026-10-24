/* 
    ---------------- Exercício 2 ----------------

    Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão 
    lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e 
    quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a 
    palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int n = sc.nextInt();

        System.out.println("");

        System.out.println("Digite " + n + " valores para x:");

        int x;
        int valoresIn = 0;
        int valoresOut = 0;

        for (int i = 1 ; i <= n ; i++ ) {
            x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                valoresIn++;
            }
            else {
                valoresOut++;
            }
        }

        System.out.println("");

        System.out.println(valoresIn + " in");
        System.out.println(valoresOut + " out");

        sc.close();
    }
}
