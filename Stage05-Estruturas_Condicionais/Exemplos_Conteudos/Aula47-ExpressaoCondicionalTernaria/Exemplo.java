import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco : preco * 0.05;

        sc.close();
    }
}
