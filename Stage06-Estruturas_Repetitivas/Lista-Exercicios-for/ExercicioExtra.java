/*
    ---------------- Exercício Extra ----------------

    Fazer um programa para analisar o desempenho de uma turma de alunos.

    Inicialmente, o programa deve ler um número inteiro positivo N,
    representando a quantidade de alunos da turma.

    Em seguida, utilizando uma estrutura de repetição FOR, o programa
    deverá ler a nota de cada aluno, considerando valores entre 0 e 10.

    Caso uma nota inválida seja informada, o programa deverá solicitar
    uma nova nota até que um valor válido seja digitado.

    Cada aluno deverá ser classificado conforme sua nota:

        - Nota >= 7.0: Aprovado
        - Nota >= 5.0 e < 7.0: Recuperação
        - Nota < 5.0: Reprovado

    Após a leitura de todas as notas, o programa deverá apresentar
    um relatório contendo:

        1. Quantidade total de alunos.
        2. Média geral da turma.
        3. Quantidade de alunos aprovados.
        4. Quantidade de alunos em recuperação.
        5. Quantidade de alunos reprovados.
        6. Maior nota registrada.
        7. Menor nota registrada.
        8. Percentual de alunos aprovados.

*/

import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int reprovado = 0;
        int recuperacao = 0;
        int aprovado = 0;
        double nota = 0.0;
        double media = 0.0;
        double menorNota = 10.0, maiorNota = 0.0;

        System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====\n");

        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        System.out.println("");
        
        while (n <= 0) {
            System.out.println("ERROR: Quantidade de alunos inválida, digite novamente!\n");
            
            System.out.print("Digite a quantidade de alunos: ");
            n = sc.nextInt();
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Digite a nota: ");
            nota = sc.nextDouble();

            System.out.println("");

            while (nota < 0.0 || nota > 10.0) {
                System.out.println("ERROR: Nota inválida, digite novamente!\n");

                System.out.println("Aluno " + i);
                System.out.print("Digite a nota: ");
                nota = sc.nextDouble();

                System.out.println("");
            }

            if (nota < 5.0) {
                reprovado++;
            } 
            else if (nota < 7.0) {
                recuperacao++;
            } 
            else {
                aprovado++;
            }

            media += nota;

            if (maiorNota < nota) {
                maiorNota = nota;
            }
            if (nota < menorNota){
                menorNota = nota;
            }
        }

        double percentualAprovacao = ((double) aprovado / n) * 100;

        System.out.println("========== RELATÓRIO FINAL ==========\n");

        System.out.println("Total de alunos: " + n);
        System.out.printf("Média geral: %.1f\n\n", media / n);

        System.out.println("Aprovados: " + aprovado);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovado + "\n");

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota + "\n");
        
        System.out.printf("Percentual de aprovação: %.1f%%\n\n", percentualAprovacao);

        System.out.println("=====================================");

        sc.close();
    }
}
