import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Para ler uma palavra sem espaços
        System.out.println("Digite uma palavra: ");
        String x = sc.next();
        System.out.println("Você digitou: " + x);

        System.out.println("---------------------------");

        // Para ler um número inteiro
        System.out.println("Digite um valor inteiro: ");
        int y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        System.out.println("---------------------------");

        // Para ler um número decimal
        System.out.println("Digite um valor decimal: ");
        double z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        System.out.println("---------------------------");

        // Para ler um caractere
        System.out.println("Digite um caractere: ");
        char a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);

        System.out.println("---------------------------");

        // Para ler um texto ATÉ A QUEBRA DE LINHA
        System.out.println("Digite DUAS frases (quando terminar uma, tecle 'Enter'): ");
        String s1, s2;
        
        sc.nextLine(); // Usado para quebra de linha pendente, referente aos 'sc.next ...' anteriores
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        System.out.println("");

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);

        sc.close();
    }
}