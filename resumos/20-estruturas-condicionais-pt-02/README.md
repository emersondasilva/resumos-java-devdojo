# Aula 21 — Estruturas Condicionais pt 02 — ELSE IF

🔗 Link do vídeo: https://youtu.be/exxeNsgcg3c

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta o **`else if`**, que é uma extensão da estrutura condicional `if` em Java.

Enquanto o `if` verifica **uma condição isolada**, o `else if` te permite **testar várias condições em sequência**, executando o bloco correspondente à **primeira condição verdadeira**.

---

## 📌 Como funciona o `else if`

A estrutura básica é:

```java
if (condicao1) {
    // executa se condicao1 for true
} else if (condicao2) {
    // executa se condicao1 for false e condicao2 for true
} else {
    // executa se nenhuma das anteriores for true
}
```

Ou seja:

* o `if` é verificado primeiro
* se for false, o `else if` é verificado
* pode haver vários else ifs em sequência
* o `else` final é opcional e serve como padrão quando tudo else falhar

---

## 🧪 Exemplo prático

Um exemplo clássico é checar faixas de idade:

```java
int idade = 20;

if (idade < 13) {
    System.out.println("Criança");
} else if (idade < 18) {
    System.out.println("Adolescente");
} else if (idade < 60) {
    System.out.println("Adulto");
} else {
    System.out.println("Sênior");
}
```

Nesse exemplo:

* se a idade for menor que 13 → “Criança”
* se for maior ou igual a 13 e menor que 18 → “Adolescente”
* se for maior ou igual a 18 e menor que 60 → “Adulto”
* se nenhuma condição anterior for satisfeita → “Sênior”

---

## 💡 Quando usar else if

Use `else if` quando você precisa testar várias possibilidades mutuamente exclusivas — ou seja, quando apenas uma condição deve ser verdadeira entre muitas.

Esse estilo é útil em lógica que depende de várias faixas de valor ou categorias diferentes.

---

## 📎 Observações

* Não precisa ter else no final, mas ele serve como **fallback** caso nenhuma condição seja verdadeira

* Os blocos são verificados de cima para baixo, na ordem em que aparecem

* Assim que uma condição for satisfeita, o bloco correspondente roda e o resto é ignorado

---

## 🧠 Ponto-chave

`else if` te permite **criar uma sequência de decisões** com base em diferentes condições, sem repetir vários `if` isolados — e é parte essencial de lógica condicional em programas Java.