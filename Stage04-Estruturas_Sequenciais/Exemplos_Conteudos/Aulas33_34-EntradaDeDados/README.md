# Entrada de dados em Java

## Scanner

Para fazer a entrada de dados em Java, criamos um objeto do tipo `Scanner`. A sintaxe fica da seguinte forma:

```java
Scanner sc = new Scanner(System.in);
```

### Observação
- É necessário importar o pacote `import java.util.Scanner;` para usar a classe `Scanner`;
- Também é necessário o comando `sc.close()` para fechar a instância da classe `Scanner` e liberar os recursos do sistema associados a ela.


### Exemplo:

```java
import java.util.Scanner; // Importa a classe Scanner

public class ExemploScanner {
    public static void main(String[] args) {
        // Instanciar o Scanner para ler os dados do console
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine(); // Lê uma linha de texto

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt(); // Lê um número inteiro

        System.out.print("Digite a sua altura (ex: 1.75): ");
        double altura = sc.nextDouble(); // Lê um número decimal

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
```