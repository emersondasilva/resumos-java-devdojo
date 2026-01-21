# Aula 11 — Tipos primitivos pt 02 — declaração e tamanho em memória

🔗 Link do vídeo: https://youtu.be/veDgI_zZ7uk

---

## 🧠 O que essa aula ensina

Essa aula continua o assunto de **tipos primitivos em Java**, mas agora o foco é:

- **Como declarar variáveis dos tipos primitivos**
- **Quanto espaço cada um ocupa na memória**

Entender isso te ajuda a escolher o tipo certo quando você programa de verdade.

---

## 📌 Declaração de variáveis primárias

Em Java você declara uma variável assim:

```java
int idade = 25;
float peso = 70.5f;
boolean ativo = true;
char letra = 'A';
```

---

* `tipo nome = valor;`
* Sempre tipo definido antes do nome
* Inicialização pode ser feita na mesma linha
* Se não inicializada, a variável só recebe valor na hora de usar

---

## 📏 Tamanho em memória

Cada tipo primitivo em Java ocupa uma quantidade específica de memória:

| Tipo | Tamanho na memória | Uso principal |
| ---- | ------------------ | ------------- |
| `byte` | 1 byte | números pequenos |
| `short`| 2 bytes | números inteiros |
| `int` | 4 bytes | inteiro padrão |
| `long` | 8 bytes | inteiro grande |
| `float`| 4 bytes | decimal, uso leve |
| `double` | 8 bytes | decimal mais preciso |
| `char` | 2 bytes (Unicode) | um caractere |
| `boolean` | 1 bit (verdadeiro/falso) | condição lógica |

💡 Aqui a tabela traz capacidade e propósito de cada tipo para ajudar em decisões de programação.

---

## 🧠 Por que isso importa

* Escolher o tipo errado pode desperdiçar memória
* Saber o tamanho ajuda em performance e adequação ao problema
* Alguns tipos só cabem em certos limites de valor, então é bom conhecer

## 📎 Exemplos no código

```java
byte b = 100;
int idade = 30;
long populacao = 8000000000L;
float temperatura = 36.6f;
double preco = 59.99;
char letra = 'J';
boolean aprovado = true;
```

Aqui você vê uma declaração por tipo e o formato padrão de cada um.

## 📝 Observações

* Tipos primitivos são diferentes dos tipos por referência como String, Array, Class etc.

* Eles têm tamanho fixo e propósito claro na linguagem.

* Saber o tamanho evita erros em programas maiores.