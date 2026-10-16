/*
    --------------- Exercício 4 ---------------

    Leia a hora inicial e a hora final de um jogo. A seguir calcule a 
    duração do jogo, sabendo que o mesmo pode começar em um dia e terminar 
    em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, conta1, conta2;

        System.out.printf("Digite a hora inicial do jogo: ");
        horaInicial = sc.nextInt();

        System.out.printf("Digite a hora final do jogo: ");
        horaFinal = sc.nextInt();

        System.out.println("");

        conta1 = (24 - horaInicial) + horaFinal;
        conta2 = horaFinal - horaInicial;

        if (horaInicial < horaFinal) {
            System.out.println("O jogo durou " + conta2 + " hora(s)");
        }
        else {
            System.out.println("O jogo durou " + conta1 + " hora(s)");
        }

        sc.close();
    }
}
