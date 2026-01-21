# Aula 15 — Operadores pt 01 — Aritméticos

🔗 Link do vídeo: https://youtu.be/1Fsvlted69g

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta os **operadores aritméticos em Java**, que são usados para fazer **operações matemáticas** com variáveis numéricas.

Esses operadores fazem parte dos fundamentos mais básicos da programação e aparecem em praticamente todos os programas.

---

## 📌 Operadores Aritméticos em Java

Java oferece operadores para as operações matemáticas fundamentais:

| Operador | O que faz                     |
|----------|------------------------------|
| `+`      | **Adiçao**                   |
| `-`      | **Subtração**                |
| `*`      | **Multiplicação**            |
| `/`      | **Divisão**                  |
| `%`      | **Resto da divisão (módulo)**|

📌 Esses operadores funcionam com tipos numéricos como `int`, `double`, `float`, `long`, etc.

---

## 🧪 Exemplos básicos de uso

Imagine que você quer somar ou dividir números:

```java
int a = 10;
int b = 3;

int soma = a + b;           // soma = 13
int subtracao = a - b;      // subtracao = 7
int multiplicacao = a * b;  // multiplicacao = 30
int divisao = a / b;        // divisao = 3  (resto descartado se for int)
int resto = a % b;          // resto = 1
```

Quando a divisão é entre inteiros (`int / int`), o resto é descartado e o resultado é inteiro. Para ter partes decimais, use `double` ou `float`.

---

## 📌 Ordem de precedência

Os operadores são avaliados na seguinte ordem (sem parênteses):

1. `*`, `/`, `%`
2. `+`, `-`

Ou seja, multiplicação e divisão têm prioridade sobre adição e subtração.

Exemplo:

```java
int resultado = 2 + 3 * 4;  // resultado = 14
```

Se quiser mudar a ordem, use parênteses:

```java
int resultado = (2 + 3) * 4; // resultado = 20
```

## 💡 Dicas importantes

* Use parênteses para tornar sua lógica mais clara
* Prefira tipos decimais (`double/float`) quando precisar de precisão na divisão
* `%` é muito usado para verificar coisas como resto (ex: se um número é par)

---

## 📎 Observações

Aprender operadores aritméticos é essencial para praticamente todo programa — desde calculadoras simples até lógica mais complexa.