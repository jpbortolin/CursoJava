/*
    --------------- Exercício 2 ---------------

    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
    indeterminada de pontos no sistema cartesiano. Para cada ponto 
    escrever o quadrante a que ele pertence. O algoritmo será encerrado 
    quando pelo menos uma de duas coordenadas for NULA (nesta situação 
    sem escrever mensagem alguma).
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite a coordenada X: ");
        x = sc.nextDouble();
        System.out.print("Digite a coordenada Y: ");
        y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0.00 && y > 0.00) {
                System.out.println("Quadrante 1");
            } 
            else if (x < 0.00 && y > 0.00) {
                System.out.println("Quadrante 2");
            } 
            else if (x < 0.00 && y < 0.00) {
                System.out.println("Quadrante 3");
            } 
            else {
                System.out.println("Quadrante 4");
            }

            System.out.println("");
            
            System.out.print("Digite a coordenada X: ");
            x = sc.nextDouble();
            System.out.print("Digite a coordenada Y: ");
            y = sc.nextDouble();
        }

        sc.close();
    }
}
