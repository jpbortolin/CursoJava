public class ExemploCasting {
    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = a / b;

        System.out.println(resultado); // Ele não vai me trazer o resultado com casas decimais, por isso o resultado será 2.0

        resultado = (double) a / b; // Fazendo o "Casting", ou seja, acrescentando o (double) para obter o resultado decimal correto
        System.out.println(resultado); 
    }
}