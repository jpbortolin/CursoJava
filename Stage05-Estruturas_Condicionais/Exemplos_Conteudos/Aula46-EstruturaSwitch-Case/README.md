# Estrutura switch-case

Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas `if-else` encadeadas alguns preferem utilizar a estrutura `switch-case`.

### Sintaxe do switch-case

```java
switch ( expressão ) {
case valor1:
    comando1
    comando2
    break;
case valor2:
    comando3
    comando4
    break;
default:
    comando5
    comando6
    break;
}
```