# Aula 10 — Tipos primitivos pt 01 — Convenções de variáveis

🔗 Link do vídeo: https://youtu.be/RRHGYyJTTpQ

---

## 🧠 O que essa aula ensina

Nesta aula o professor começa a explicar os **tipos primitivos do Java**, focando **nas convenções de nomes de variáveis** e como declarar variáveis corretamente.

Tipos primitivos são os **tipos básicos de dados** usados para armazenar valores simples em Java, como números, texto simples e valores lógicos. Eles são a base de todo programa Java.

---

## 🧩 O que são variáveis em Java

- **Variável** é como uma “caixa” na memória que guarda um valor.  
- Em Java, **todas as variáveis têm um tipo definido** quando você as declara.  
- A linguagem é **fortemente tipada**, ou seja, o tipo não pode mudar depois de definido.

---

## 📝 Convenções de nomes de variáveis

Java possui **recomendações de estilo** para que seu código fique consistente e fácil de ler:

* Use **letras minúsculas** para nomes simples.  
* Quando tiver mais de uma palavra, use **camelCase** (ex: `nomeDoUsuario`).  
* Evite usar nomes muito curtos ou sem significado (`x`, `y`, `a`), prefira nomes descritivos (`idade`, `salarioAtual`).  

Convenções ajudam você e outros programadores a entender o código muito mais rápido.

---

## 📌 Primeiro exemplo de declaração

```java
int idade = 25;
double salario = 3500.50;
char genero = 'M';
boolean ativo = true;
```

* `int` → números inteiros
* `double` → números com casas decimais
* `char` → um único caractere
* `boolean` → verdadeiro ou falso

Esses são alguns dos tipos primitivos mais usados em Java.

## 💡 Pontos importantes

* Java não permite mudar o tipo depois da declaração (ex: variável definida como `int` não pode virar `double`).
* O nome da variável deve começar com letra (letras minúsculas preferencialmente).
* Espere ver muitos exemplos em próximas aulas com mais tipos.