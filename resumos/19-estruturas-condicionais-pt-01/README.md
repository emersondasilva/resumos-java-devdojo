# Aula 20 — Estruturas condicionais pt 01 — IF

🔗 Link do vídeo: https://youtu.be/gk1_Pn8GZA4

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta a **estrutura condicional `if`** em Java — a primeira forma de tomar decisões no código.

Condicionais permitem que você defina **comportamentos diferentes dependendo de uma condição**.  
Ou seja, só executa um bloco de código se uma condição for verdadeira (`true`).

---

## 📌 O básico do `if`

O comando `if` em Java funciona assim:

```java
if (condicao) {
    // código que será executado se condição for verdadeira
}
```

Ele verifica uma expressão que retorna `true` ou `false` e, se for `true`, executa o bloco interno; caso contrário, pula esse bloco.

---

## 🧪 Exemplo prático

```java
int idade = 18;

if (idade >= 18) {
    System.out.println("Você é maior de idade!");
}
```

Aqui:

* Se `idade >= 18` for **true**, o texto será impresso
* Se for **false**, nada acontecerá nesse bloco

---

## 💡 Como isso é usado

O `if` é útil sempre que você precisa verificar uma condição antes de fazer algo:

* validar entrada do usuário
* checar pré-requisitos antes de continuar
* tomar decisões em jogos, sistemas e formulários

## 📎 Observações importantes

* A expressão entre parênteses deve retornar um boolean (`true` ou `false`)
* O bloco de código entre `{}` só roda quando a condição for verdadeira