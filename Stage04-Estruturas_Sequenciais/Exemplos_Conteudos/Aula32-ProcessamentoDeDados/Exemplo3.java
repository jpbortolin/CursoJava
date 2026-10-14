// Calcular área de um trapézio, dada a fórmula: area = ((b + B) / 2) * h 
// sendo: b = 6 ; B = 8 ; h = 5

public class Exemplo3 {
    public static void main(String[] args) {
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = ((b + B) / 2.0) * h;

        System.out.printf("A área do trapézio é de %.2f cm²\n", area);
    }   
}