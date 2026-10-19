/*
    ----------------- Exercício extra ----------------- 

    Um banco deseja desenvolver um sistema de caixa eletrônico que 
    permita aos clientes realizar operações bancárias.

    O programa deverá iniciar com um saldo de R$ 1.000,00 e apresentar 
    o seguinte menu:

    ====================================
              CAIXA ELETRÔNICO
    ====================================

    1 - Consultar saldo
    2 - Realizar depósito
    3 - Realizar saque
    4 - Encerrar
*/

import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00;
        int opcoes = 0;
        int qtdSaques = 0;
        int qtdDepositos = 0;

        while (opcoes != 4) {
            System.out.println("");
            System.out.println("====================================");
            System.out.println("          CAIXA ELETRÔNICO");
            System.out.println("====================================\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - Encerrar\n");

            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();

            System.out.println("");

            switch (opcoes) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f", saldo);
                    System.out.println("");
                    break;
                case 2:
                    double deposito;
                    System.out.print("Informe o valor de depósito: ");
                    deposito = sc.nextDouble();

                    if (deposito <= 0.00) {
                        System.out.println("Valor inválido, informe um novo válido!");
                    } 
                    else {
                        saldo += deposito;
                        qtdDepositos++;
                        System.out.println("Depósito realizado com sucesso!");
                    }
                    break;
                case 3:
                    double saque;
                    System.out.print("Informe o valor do saque: ");
                    saque = sc.nextDouble();

                    if (saque <= 0.00) {
                        System.out.println("Valor inválido, informe um valor válido!");
                    } 
                    else if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } 
                    else {
                        saldo -= saque;
                        qtdSaques++;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Informe uma opção válida no menu...");
                    break;
            }
        }

        System.out.println("========== RESUMO ==========");
        System.out.printf("Saldo final: R$ %.2f\n", saldo);
        System.out.println("Depósitos realizados: " + qtdDepositos);
        System.out.println("Saques realizados: " + qtdSaques);
        System.out.println("");

        System.out.println("Obrigado por utilizar nosso caixa eletrônico!");

        sc.close();
    }
}
