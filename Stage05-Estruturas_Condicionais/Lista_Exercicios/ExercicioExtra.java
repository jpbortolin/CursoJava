/*
    --------------- Exercício Extra ---------------

    Um estacionamento cobra seus clientes de acordo com o tempo que o 
    veículo permanece estacionado.
    
    A tabela de preços é a seguinte:
     ____________________________________________________________________
    |      TEMPO ESTACIONADO      |                 VALOR                 |
    | --------------------------- | ------------------------------------- |
    |           1 hora            |                R$ 8,00                |
    | Acima de 1 hora até 3 horas |  R$ 8,00 + R$ 5,00 por hora adicional |
    |      Acima de 3 horas       | R$ 18,00 + R$ 4,00 por hora adicional |
    |_____________________________|_______________________________________|

    Desenvolva um programa que leia a quantidade de horas estacionadas 
    e calcule o valor total a pagar.
*/

import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int horas;
        double valor;

        System.out.printf("Digite a quantidade de horas que você permanecerá no estacionamento: ");
        horas = sc.nextInt();

        if (horas < 1) {
            System.out.println("Erro, hora inválida!");
        }
        else if (horas == 1 ) {
            System.out.println("O valor a pagar é de R$ 8,00");
        }
        else if (horas <= 3) {
            valor = 8 + ((horas - 1) * 5);
            System.out.printf("O valor a pagar é de R$ %.2f\n", valor);
        }
        else {
            valor = 18 + ((horas - 3) * 4);
            System.out.printf("O valor a pagar é de R$ %.2f\n", valor);
        }

        sc.close();
    }
}
