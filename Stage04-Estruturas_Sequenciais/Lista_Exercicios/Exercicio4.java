    /*
        --------------- Exercício 4 ---------------

        Fazer um programa que leia o número de um funcionário, seu número de 
        horas trabalhadas, o valor que recebe por hora e calcula o salário 
        desse funcionário. A seguir, mostre o número e o salário do 
        funcionário, com duas casas decimais.
    */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id, horasTrabalhadas;
        double salario, salarioTotal;

        System.out.print("Digite o ID do funcionário: ");
        id = sc.nextInt();

        System.out.print("Digite o total de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        salario = sc.nextDouble();

        System.out.println("");

        salarioTotal = salario * horasTrabalhadas;

        System.out.println("ID: " + id);
        System.out.printf("Salário: U$ %.2f \n", salarioTotal);

        sc.close();
    }
}