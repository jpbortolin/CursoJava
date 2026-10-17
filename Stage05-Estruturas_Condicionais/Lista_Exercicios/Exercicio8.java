/*
    --------------- Exercício 8 ---------------

    Em um país imaginário denominado Lisarb, todos os habitantes ficam 
    felizes em pagar seus impostos, pois sabem que nele não existem 
    políticos corruptos e os recursos arrecadados são utilizados em 
    benefício da população, sem qualquer desvio. A moeda deste país é o 
    Rombus, cujo símbolo é o R$.
    
    Leia um valor com duas casas decimais, equivalente ao salário de uma 
    pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta 
    pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

     ________________________________________________
    |            RENDA            | IMPOSTO DE RENDA |
    | --------------------------- | ---------------- |
    |  De R$ 0,00 à R$ 2.000,00   |       Isento     |
    |  R$ 2.000,01 à R$ 3.000,00  |         8%       |
    |  R$ 3.000,01 à R$ 4.500,00  |        18%       |
    |     Acima de R$ 4.500,00    |        28%       |
    |_____________________________|__________________|

    Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% 
    apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 
    até R$ 2000.00 é isenta de Imposto de Renda.
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double renda, imposto;

        System.out.print("Digite o valor da sua renda em R$: ");
        renda = sc.nextDouble();

        System.out.println("");

        if (renda >= 0.00 && renda <= 2000.00) {
            System.out.println("Isento de imposto");
        }
        else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if (renda <= 4500.00) {
            imposto = ((renda - 3000) * 0.18) + 80.00 ;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if (renda > 4500.00) {
            imposto = ((renda - 4500) * 0.28) + 350.00;
            System.out.printf("R$ %.2f\n", imposto);
        }

        sc.close();
    }
}
