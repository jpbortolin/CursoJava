# Expressões Lógicas

São expressões que comparam um valor ou uma coisa com outro valor/coisa, assim como as Expressões Comparativas.

## Operadores Lógicos

| Operador | Significado |
| --- | --- |
| && | E |
| \|\| | OU |
| ! | NÃO |

### Operador && (AND / E)

Exige que todas as condições envolvidas sejam verdadeiras para que o resultado final seja verdadeiro.

**Comportamento:** Se a primeira condição for falsa, ele nem avalia a segunda.

```java
// Exemplo prático: Para entrar em um clube VIP, a pessoa precisa ser maior de idade (+18) e estar com o convite pago

idade >= 18 && convitePago == true
```

### Operador || (OR / OU)

Exige que pelo menos uma das condições seja verdadeira para que o resultado final seja verdadeiro.

**Comportamento:** Se a primeira condição já for verdadeira, ele não precisa avaliar o restante. Só resulta em falso se tudo for falso.

```java
// Exemplo prático: Você ganha desconto se for estudante ou se for idoso.

estudante == true || idoso == true
```

### Operador ! (NOT / Negação)

Inverte o valor lógico. O que é verdadeiro vira falso, e o que é falso vira verdadeiro.

**Comportamento:** É um operador unário (trabalha com apenas um valor ou expressão).

```java
// Exemplo prático: Verificar se o usuário não está bloqueado.

!usuarioBloqueado // Se usuarioBloqueado for true, o ! transforma a expressão em false
```