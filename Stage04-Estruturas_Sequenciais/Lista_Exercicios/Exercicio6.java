/*
    --------------- Exercício 6 ---------------

    Fazer um programa que leia três valores com ponto flutuante de 
    dupla precisão: A, B e C. Em seguida, calcule e mostre:

    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        System.out.println("Digite o valor de A, B e C, respectivamente (Ex: 3.0 4.1 12.5): ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = (a * c) / 2.0;
        areaCirculo = pi * Math.pow(c, 2.0);
        areaTrapezio = ((a + b) * c) / 2.0;
        areaQuadrado = Math.pow(b, 2.0);
        areaRetangulo = a * b;

        System.out.println("");

        System.out.printf("Área do triângulo = %.3f\n", areaTriangulo);
        System.out.printf("Área do círculo = %.3f\n", areaCirculo);
        System.out.printf("Área do trapézio = %.3f\n", areaTrapezio);
        System.out.printf("Área do quadrado = %.3f\n", areaQuadrado);
        System.out.printf("Área do retângulo = %.3f\n", areaRetangulo);

        sc.close();
    }
}