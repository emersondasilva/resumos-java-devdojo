# Aula 12 — Tipos primitivos pt 03 — Casting

🔗 Link do vídeo: https://youtu.be/74hd4o7V328

---

## 🧠 O que essa aula ensina

Nesta aula o professor mostra **como converter valores entre tipos primitivos em Java**, processo que chamamos de **casting**.  
Casting é quando você precisa transformar um valor de um tipo para outro, como transformar um `int` em `double`, ou converter um `double` em `int`.

O Java permite essas conversões, mas algumas são **automáticas** e outras precisam ser feitas **manualmente** — e saber a diferença entre elas é importante para evitar bugs ou perda de dados.

---

## 🔁 O que é casting

Em Java, casting é a **conversão explícita de um valor de um tipo para outro**. Por padrão, o compilador faz alguns tipos de conversão automaticamente, mas outros exigem que você **diga exatamente para onde quer converter**, usando parênteses com o tipo desejado.

---

## 🔹 1. Casting automático (Widening)

Quando você converte um tipo **menor para um tipo maior**, o Java faz isso automaticamente:

```java
int numeroInt = 10;
double numeroDouble = numeroInt; // int → double automático
```

Nesse caso não é preciso usar (double) porque a conversão é segura e não perde informação — valores inteiros cabem em double.

---

## 🔸 2. Casting manual (Narrowing)

Quando você converte de um tipo maior para um tipo menor, o Java exige que você faça o casting explicitamente, porque pode ocorrer perda de informação:

```java
double valor = 9.78;
int inteiro = (int) valor; // casting manual
```

Aqui usamos (int) antes do valor para dizer ao compilador que estamos cientes da conversão, mesmo que parte decimal seja descartada.

---

## 🧠 Mais exemplos de casting

```java
long grande = 100L;
int pequeno = (int) grande;

float f = 5.5f;
int inteiro2 = (int) f;

char letra = 'A';
int codigo = (int) letra;
```

* Nem sempre é obrigatório fazer cast (ex: `int → long` é automático).
* Em casos `double → int` ou `long → byte` você precisa usar casting explícito.

## ⚠️ Dicas importantes

* Quando fizer casting manual, você pode perder informação — como parte decimal.

* O Java tem uma ordem natural de tipos (do menor para o maior):     
```java
byte → short → char → int → long → float → double
```
e a conversão automática segue essa direção.

* Tipos boolean não participam de casting.

## 📎 Observações

Casting é uma habilidade básica que vai aparecer o tempo todo quando você:

* lê dados externos
* recebe números que podem ter decimais
* precisa ajustar valores entre métodos e funções

Saber como converter tipos sem erros é uma base importante para programas maiores.
