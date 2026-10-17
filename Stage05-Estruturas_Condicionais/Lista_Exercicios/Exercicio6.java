/*
    --------------- Exercício 6 ---------------

    Você deve fazer um programa que leia um valor qualquer e apresente 
    uma mensagem dizendo em qual dos seguintes intervalos 
    ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
    Obviamente se o valor não estiver em nenhum destes intervalos, 
    deverá ser impressa a mensagem “Fora de intervalo”.    
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.printf("Digite um valor entre 0 à 100: ");
        valor = sc.nextDouble();   
        System.out.println("");

        if (valor >= 0.00 || valor <= 25.00) {
            System.out.println("Está no intervalo [0,25]");
        }
        else if (valor >= 25.01 || valor <= 50.00) {
            System.out.println("Está no intervalo [25,50]");
        }
        else if (valor >= 50.01 || valor <= 75.00) {
            System.out.println("Está no intervalo [50,75]");
        }
        else if (valor >= 75.01 || valor <= 100.00) {
            System.out.println("Está no intervalo [75,100]");
        }
        else {
            System.out.println("Está fora do intervalo");
        }

        sc.close();
    }
}
