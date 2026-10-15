import java.util.Scanner;

public class ExemploBhaskara {
    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ Calculadora da fórmula de Bhaskara ------------");
        
        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.println("");

        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.println("");

        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();
        System.out.println("");

        delta = (Math.pow(b, 2.0)) - (4 * a *c);
        System.out.print("O valor de Δ = " + delta);
        System.out.println("");

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("O valor de x1 = " + x1);
        System.out.println("O valor de x2 = " + x2);

        sc.close();
    }
}
