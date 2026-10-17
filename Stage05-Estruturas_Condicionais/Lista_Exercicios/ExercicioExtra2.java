/*
    --------------- Exercício Extra ---------------

    Uma loja de eletrônicos deseja desenvolver um sistema que calcule 
    o valor final de uma compra, considerando o valor total e a forma 
    de pagamento escolhida pelo cliente.

    A loja oferece os seguintes descontos:

    ------------------------------------------------
    | VALOR DA COMPRA          | DESCONTO           |
    |--------------------------|--------------------|
    | Até R$ 200,00            | Sem desconto       |
    | Acima de R$ 200 até 500  | 5%                 |
    | Acima de R$ 500 até 1000 | 10%                |
    | Acima de R$ 1000         | 15%                |
    ------------------------------------------------

    Além disso, existe uma condição especial de acordo com a forma de 
    pagamento:

    ------------------------------------------------
    | FORMA DE PAGAMENTO       | CONDIÇÃO           |
    |--------------------------|--------------------|
    | 1 - PIX                  | 5% de desconto     |
    | 2 - Cartão de débito     | Sem desconto       |
    | 3 - Cartão de crédito    | Acréscimo de 3%    |
    ------------------------------------------------

    IMPORTANTE:
    O desconto ou acréscimo da forma de pagamento deve ser aplicado sobre 
    o valor que já recebeu o primeiro desconto, e não sobre o valor original.
*/

import java.util.Locale;
import java.util.Scanner;

public class ExercicioExtra2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        double totalCompra, valorFinal;
        int formaPagamento;
        
        System.out.print("Valor da compra: ");
        totalCompra = sc.nextDouble();

        System.out.print("Forma de pagamento (1 - PIX | 2 - Cartão de débito | 3 - Cartão de crédito): ");
        formaPagamento = sc.nextInt();

        System.out.println("");

        if (totalCompra <= 0 || formaPagamento < 1 || formaPagamento > 3) {
            System.out.println("Dados inválidos!");
        }
        else {
            // Bloco para calcular o desconto da compra
            if (totalCompra <= 200.00) {
                valorFinal = totalCompra;
            }
            else if (totalCompra <= 500.00) {
                valorFinal = totalCompra * 0.95;
            }
            else if (totalCompra <= 1000.00) {
                valorFinal = totalCompra * 0.90;
            }
            else {
                valorFinal = totalCompra * 0.85;
            }

            // Bloco para calcular o desconto ou acréscimo conforme forma de pagamento
            if (formaPagamento == 1) {
                valorFinal *= 0.95;
            }
            else if (formaPagamento == 3) {
                valorFinal *= 1.03;         
            }

            System.out.printf("O valor total da compra ficou R$ %.2f\n", valorFinal);
        }

        sc.close();
    }
}
