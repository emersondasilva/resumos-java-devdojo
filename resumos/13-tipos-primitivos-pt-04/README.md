# Aula 13 — Tipos Primitivos pt 04 — String não é tipo primitivo

🔗 Link do vídeo: https://youtu.be/13VfcFXwsjw

---

## 🧠 O que essa aula ensina

Nesta aula o professor explica **por que `String` em Java não é considerado um tipo primitivo**, mesmo que seja usado com frequência para representar texto.

Java tem **tipos primitivos** como `int`, `double`, `boolean`, `char`, etc., que armazenam valores simples diretamente na memória. Já a `String` **é uma classe**, ou seja, é um **tipo de referência**, não primitivo.

---

## 📌 Por que String não é tipo primitivo

* `String` é uma **classe** (um objeto), parte da biblioteca padrão (`java.lang.String`).  

* Tipos primitivos **não têm métodos**; já `String` possui métodos como `length()`, `toUpperCase()`, `substring()` etc.

* Por ser objeto, uma variável `String` guarda **referência para um objeto na memória**, não o valor diretamente como acontece com os tipos primitivos.

---

## 💡 Como declarar e usar String

Em Java você declara uma `String` assim:

```java
String nome = "Olá Mundo!";
System.out.println(nome);
```

* As aspas duplas (" ") indicam uma cadeia de caracteres.
* Strings permitem concatenação com +:

```java
String saudacao = "Olá";
String frase = saudacao + ", pessoal!";
```

Isso cria uma nova sequência de texto combinando as duas.

---

## 🧠 O que String pode fazer (exemplos de métodos)

Como `String` é um objeto, ele possui métodos que facilitam o trabalho com texto:

* `length()` — retorna o tamanho da string
* `toUpperCase()` / `toLowerCase()` — muda o caso das letras
* `substring()` — pega partes do texto
* `equals()` — compara conteúdos de duas strings

---

## 📎 Diferença entre tipos primitivos e Strings

| Aspecto | Tipos Primitivos | String |
| ------- | ---------------- | ------ |
| É tipo | primitivo | objeto |
| Possui métodos? | Não | Sim |
| Armazenamento | valor direto | referência para objeto |
| Exemplos | int, double, boolean | String |

---

## 📝 Observações importantes

* Mesmo não sendo primitivo, String é usado como se fosse simples, e por isso aparece logo no começo de um curso.

* Em uso real, String é um dos tipos de objeto mais utilizados em Java.