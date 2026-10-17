/*
    --------------- Exercício 7 ---------------

    Leia 2 valores com uma casa decimal (x e y), que devem representar as 
    coordenadas de um ponto em um plano. A seguir, determine qual o 
    quadrante ao qual pertence o ponto, ou se está sobre um dos eixos 
    cartesianos ou na origem (x = y = 0).

    Se o ponto estiver na origem, escreva a mensagem “Origem”.

    Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, 
    conforme for a situação.
    
                                y
                                |
                                |
                   Q2           |          Q1 
                                |
                                |
            ------------------------------------------ x
                                |
                                |
                   Q3           |          Q4
                                |
                                |

*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();
        
        System.out.printf("Digite o valor de y: ");
        y = sc.nextDouble();

        System.out.println("");

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (y == 0.00) {
            System.out.println("Eixo X");
        }
        else if (x == 0.00) {
            System.out.println("Eixo Y");
        }
        else if (x > 0.00 && y > 0.00) {
            System.out.println("Quadrante 1 (Q1)");
        }
        else if (x < 0.00 && y > 0.00) {
            System.out.println("Quadrante 2 (Q2)");
        }
        else if (x < 0.00 && y < 0.00) {
            System.out.println("Quadrante 3 (Q3)");
        }
        else {
            System.out.println("Quadrante 4 (Q4)");
        }

        sc.close();
    }
}
