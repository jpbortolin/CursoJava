// Exemplo 3 da aula 32
// Calcular área de um trapézio, dada a fórmula: area = ((b + B) / 2) * h 
// sendo: b = 6 ; B = 8 ; h = 5

public class Main {
    public static void main(String[] args) {
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = ((b + B) / 2.0) * h;

        System.out.printf("A área do trapézio é de %.2f cm²\n", area);
    }    
}

class ExemploCasting {
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