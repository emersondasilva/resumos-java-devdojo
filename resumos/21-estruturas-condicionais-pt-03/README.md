# Aula 22 — Estruturas Condicionais pt 03 — Operador ternário

🔗 Link do vídeo: https://youtu.be/gU-qCpBC5jk

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta o **operador ternário em Java**, que é um jeito **mais curto e direto** de fazer uma decisão simples que poderia ser escrita com um `if / else`.

O operador ternário permite que você escreva uma expressão condicional em **uma única linha**, retornando um valor diferente dependendo de uma condição booleana.

---

## 📌 Sintaxe do operador ternário

```java
resultado = (condicao) ? valorSeTrue : valorSeFalse;
```

* `condicao` → expressão que retorna true/false
* `?` → separa a condição dos valores
* `valorSeTrue` → resultado se a condição for verdadeira
* `:` → separa o resultado verdadeiro do falso
* `valorSeFalse` → resultado se a condição for falsa

---

## 🧪 Exemplos práticos

*  **Exemplo com números**

```java
int a = 10;
int b = 20;
int maior = (a > b) ? a : b;
System.out.println(maior); // imprime 20
```

Aqui:

* a > b → false
* então `maior` recebe `b`
* e o resultado é `20`.

---

* **Exemplo com mensagem de texto**

```java
int idade = 18;
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
System.out.println(status); // imprime "Maior de idade"
```

Nesse caso:

* condição → idade >= 18
* se a condição for verdadeira → retorna `"Maior de idade"`
* se for falsa → retornaria `"Menor de idade"`

## 🧠 Por que usar o operador ternário

* Ele torna o código mais conciso e legível quando a decisão é simples.

* Substitui um if / else básico quando você quer atribuír um valor baseado em uma condição.

* É útil dentro de expressões, como em `System.out.println()` ou ao atribuir valores.

---

## ⚠️ Observações importantes

* O operador ternário não substitui um `if / else` complexo com vários blocos de código.

* Use-o quando a lógica for simples e o resultado for um valor direto retornado.

* Todas as partes do ternário devem ter tipos compatíveis (não misture `int` com `String` sem conversão).

---

## 📎 Comparação com if / else

Com `if / else`:

```java
int maior;
if (a > b) {
    maior = a;
} else {
    maior = b;
}
```

Com operador ternário:

```java
int maior = (a > b) ? a : b;
```

O operador ternário faz a mesma coisa, mas em menos linhas e de forma mais expressiva.

---

## 📌 Conclusão

O operador ternário é uma forma **curta e poderosa** de escrever condicionais simples em Java.
Ele é especialmente útil quando você quer **atribuir valores** com base numa condição diretamente na declaração.