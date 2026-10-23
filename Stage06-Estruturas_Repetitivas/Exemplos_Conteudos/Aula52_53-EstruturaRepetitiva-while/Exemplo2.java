import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        while (x < 3) {
            y += 2;
            x += 1;
            System.out.println("X: "+ x + " / Y: " + y);
        }

        sc.close();
    }
}
