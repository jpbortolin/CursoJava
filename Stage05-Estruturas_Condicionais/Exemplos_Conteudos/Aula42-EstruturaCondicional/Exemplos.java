import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hora;

        System.out.println("Digite qual seu horário atual (Ex: 12.45 - 12 horas e 45 minutos): ");
        hora = sc.nextDouble();

        if (hora > 5.00 && hora < 12.00) {
            System.out.println("Bom dia!");
        }
        else if (hora >= 12.00 && hora < 18.00) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
        
        sc.close();
    }
}
