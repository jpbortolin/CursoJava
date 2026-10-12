# Expressões Aritméticas

São aquelas expressões que quando são calculadas, irão resultar em um valor numérico, por exemplo:
```
4 + 5 = 9

// 4 + 5 é a expressão
// 9 é o valor numérico/resutaldo da expressão
```

## Operadores Aritméticos

| Operador | Significado |
| --- | --- |
| + | Adição |
| - | Subtração |
| * | Multiplicação |
| / | Divisão |
| % | Resto da divisão ("mod") |

> **Precedência:**
> - 1º lugar: * , / e %
> - 2º lugar: + e -

<br>

---

<br>
<br>


# Variáveis e tipos básicos em Java

## Definição informal

Em programação, uma variável é uma porção de memória (RAM) utilizada para armazenar dados durante a execução dos programas.

## Declaração de variáveis

### Sintaxe:

```
<tipo> <nome> = <valor>;

// <valor> é opcional definir ou não
```

### Exemplos:

```java
int idade = 20;
double altura = 1.70;
char sexo = 'F';
String nome = "Larissa"
```

### Uma variável possui:

- Nome (ou identificador);
- Tipo;
- Valor;
- Endereço (qual da memória a variável está).

## Tipos primitivos em Java

| Descrição | Tipo | Tamanho | Valores | Valor padrão |
|---|---|---|---|---|
| Número inteiro | `byte` | 8 bits | -128 a 127 | `0` |
| Número inteiro | `short` | 16 bits | -32768 a 32767 | `0` |
| Número inteiro | `int` | 32 bits | -2147483648 a 2147483647 | `0` |
| Número inteiro | `long` | 64 bits | -9223372036854775808 a 9223372036854775807 | `0L` |
| Ponto flutuante | `float` | 32 bits | Aproximadamente ±3,4028235 × 10³⁸ | `0.0f` |
| Ponto flutuante | `double` | 64 bits | Aproximadamente ±1,7976931348623157 × 10³⁰⁸ | `0.0d` |
| Unidade de código Unicode (UTF-16) | `char` | 16 bits | `'\u0000'` a `'\uFFFF'` | `'\u0000'` |
| Valor lógico | `boolean` | Não definido pela linguagem | `true` ou `false` | `false` |

> Os valores padrão se aplicam aos atributos e aos elementos de arrays.
> Variáveis locais precisam ser inicializadas antes do uso.

### Observações

- `float` e `double` representam números com casas decimais. A tabela mostra os limites aproximados de magnitude dos valores finitos; eles também possuem valores especiais, como infinito e `NaN`.
- `char` armazena uma unidade UTF-16. Alguns caracteres, como certos emojis, precisam de duas unidades.
- Exemplo: `'a'` equivale a `'\u0061'`.
- `String` representa uma cadeia de caracteres, como palavras e textos. **Não é um tipo primitivo**, mas sim uma classe.

### Exemplo de String

```java
String nome = "João Pedro";
```

---

<br>
<br>

# Processamento de dados em Java

- Comando de atribuição.

### Sintaxe:

```
<variável> = <expressão>;

// O '=' lê-se "recebe"
```

### Exemplo:

```java
int x, y;

x = 5;
y = 2 * x;

System.out.println(x); // Resultado será 5
System.out.println(y); // Resultado será 10, pois  2 * 5 = 10
```