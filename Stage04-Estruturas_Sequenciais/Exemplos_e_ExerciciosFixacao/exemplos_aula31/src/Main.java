public class Main {
    public static void main(String[] args) {
        System.out.print("Saída de dados");
        System.out.println(" em Java");
        System.out.println("-----------------------");

        System.out.println("Variável do tipo int:");
        int y = 32;
        System.out.println(y);
        System.out.println("-----------------------");

        System.out.println("Variável do tipo double:");
        double x = 10.357484;
        System.out.println(x);
        System.out.printf("%.2f\n", x); // Valor com duas casas depois da vírgula
        System.out.printf("%.4f\n", x); // Valor com quatro casas depois da vírgula
        System.out.println("-----------------------");

        System.out.println("Concatenando vários elementos:");
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros\n", x); // Concatenação com valor double no "System.out.printf"
        System.out.println("-----------------------");

        System.out.println("Concatenando diferentes variáveis:");
        String nome = "João Pedro";
        int idade = 22;
        double renda = 3000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}