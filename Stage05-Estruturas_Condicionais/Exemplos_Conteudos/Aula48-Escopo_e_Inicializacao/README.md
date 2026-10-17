# Escopo e inicialização

- Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
- Uma variável não pode ser usada se não for iniciada.

### Demonstração

```java
double price = sc.nextDouble();

if (price > 100.0) {
    double discount = price * 0.1;
}

System.out.println(discount);

// Irá dar um erro de execução, pois a variável "discount"
// foi iniciada dentro da estrutura "if"
```

Para não ocorrer esse erro, deve-se fazer o seguinte:

```java
double price = sc.nextDouble();
double discount = 0;

if (price > 100.0) {
    discount = price * 0.1;
}

System.out.println(discount);

// Agora irá executar normalmente, pois ela foi declarada e
// inicializada fora da estrutura condicional e
// dentro da própria classe/método que está
```