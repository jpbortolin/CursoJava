# Estrutura repetitiva for (para)

É uma **estrutura de controle** que **repete** um bloco de comandos **para** um certo intervalo de valores.

> *Quando usar:* quando se sabe previamente a quantidade de repetições ou o intervalo de valores

### Sintaxe

```java
for (inicio ; condicao ; incremento) {
    comando1
    comando2
}
```

### Regra
- `inicio`: executa somente na primeira vez;
- `condicao`: Verdade - executa e volta / Falso: pula fora;
- `incremento`: executa toda vez depois de voltar.

## Importante

Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTAGEM:

```java
for (int i=0; i<5; i++) {
    System.out.println("Valor de i: " + i);
}

/* 
    Resultado na tela:

    Valor de i: 0
    Valor de i: 1
    Valor de i: 2
    Valor de i: 3
    Valor de i: 4
*/
```

### Contagem Regressiva

```java
for (int i=4; i>=0; i--) {
    System.out.println("Valor de i: " + i);
}

/* 
    Resultado na tela:

    Valor de i: 4
    Valor de i: 3
    Valor de i: 2
    Valor de i: 1
    Valor de i: 0
*/
```