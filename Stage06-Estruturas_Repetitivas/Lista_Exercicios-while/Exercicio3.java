/*
    --------------- Exercício 3 ---------------

    Um Posto de combustíveis deseja determinar qual de seus produtos tem 
    a preferência de seus clientes. Escreva um algoritmo para ler o tipo 
    de combustível abastecido (codificado da seguinte forma: 1.Álcool 
    2.Gasolina 3.Diesel 4.Fim). 
    
    Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
    deve ser solicitado um novo código (até que seja válido). O programa 
    será encerrado quando o código informado for o número 4. 
    
    Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de 
    clientes que abasteceram cada tipo de combustível.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoCombustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombustivel != 4) {
            System.out.print("Informe o tipo de combustível abastecido: ");
            tipoCombustivel = sc.nextInt();

            System.out.println("");

            switch (tipoCombustivel) {
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina ++;
                    break;
                case 3:
                    diesel ++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Código inválido, digite novamente um valor válido!");
                    System.out.println("");
                    break;
            }
        }

        System.out.println("");

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


        sc.close();
    }
}
