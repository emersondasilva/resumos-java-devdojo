# Aula 19 — Operadores pt 05 — Atribuição

🔗 Link do vídeo: https://youtu.be/EFrq1WxsL1k

---

## 🧠 O que essa aula ensina

Nesta aula o professor explica os **operadores de atribuição em Java**, que são usados para **atribuir valores a variáveis** e também para **combinar operações aritméticas com atribuição**.

Enquanto os operadores aritméticos (`+`, `-`, `*`, `/`, `%`) fazem contas, os operadores de atribuição dizem **onde e como salvar os resultados dessas contas** na memória.

---

## 📌 Operador básico de atribuição

O operador mais simples é o **`=`**, que recebe um valor e coloca dentro de uma variável:

```java
int x = 10;
```

Aqui:

* o valor `10` é atribuído à variável x
* `x` agora contém `10` na memória

---

## 🔁 Operadores de atribuição combinados com aritmética

O Java tem operadores que fazem operação e atribuição em uma linha só, o que deixa o código menor e mais claro.

### 📍 += → acumula valor

```java
int x = 5;
x += 3;  // equivalente a: x = x + 3
```

Depois disso, `x` vai valer `8`.

---

### 📍 -= → subtrai e atribui

```java
int y = 10;
y -= 4;  // equivalente a: y = y - 4
```

Resultado: `y` vale `6`.

---

### 📍 *= → multiplica e atribui

```
int z = 3;
z *= 4;  // z = z * 4
```

Resultado: `z` vale `12`.

---

### 📍 /= → divide e atribui

```java
int a = 20;
a /= 5;  // a = a / 5
```

Resultado: `a` vale `4`.

---

### 📍 %= → resto e atribuição

```java
int b = 9;
b %= 2;  // b = b % 2
```

Resultado: `b` vale `1`.

---

## 🧠 Por que isso importa

* Os operadores de atribuição tornam o código mais curto e legível
* Eles são muito usados em loops, cálculos acumulativos e atualização de variáveis em geral
* Eles ajudam a evitar repetir o nome da variável várias vezes numa linha só

## 📎 Observações

* Esses operadores alteram diretamente o valor da variável

* Eles combinam lógica de cálculo com atribuição de valor

* Você vai ver esses operadores aparecerem com frequência em laços (`for`, `while`) e manipulação de dados em programas reais