# Aula 27 — Estruturas de Repetição pt 01 — Laços de repetição

🔗 Link do vídeo: https://youtu.be/hEl67ZAU_Hg

---

## 🧠 O que essa aula ensina

Nesta aula o professor começa a mostrar o que são **estruturas de repetição** em Java — também chamadas de **laços (loops)** — que permitem executar partes do código várias vezes de forma automática.

Estruturas de repetição são muito utilizadas quando queremos:
- repetir algo **enquanto uma condição for verdadeira**
- executar algo por uma **quantidade conhecida de vezes**
- controlar o fluxo do programa de forma dinâmica

---

## 📌 Tipos de laços que aparecem aqui

Java possui três laços de repetição principais:

### 🔹 1. `while`

Loop que continua **enquanto a condição for verdadeira**.  
Ele verifica a condição antes de executar o bloco:

```java
while (condicao) {
    // bloco repetido
}
```

👉 Se a condição já for falsa no começo, o bloco nem é executado.

---

### 🔹 2. `do-while`

Loop parecido com o while, porém executa o bloco pelo menos uma vez, pois a condição é verificada depois da execução:

```java
do {
    // executa pelo menos uma vez
} while (condicao);
```

👉 Útil quando você quer garantir a execução inicial antes da condição final.

---

### 🔹 3. `for`

Loop usado quando você sabe de antemão quantas vezes quer repetir:

```java
for (int i = 0; i < 5; i++) {
    // bloco repetido
}
```

👉 Ele tem três partes:

- inicialização (`int i = 0`)
- condição (`i < 5`)
- incremento/decremento (`i++`)

---

## 🧪 Quando usar cada um

- `for` → quando você sabe quantas repetições quer
- `while` → quando depende de uma condição que muda no tempo
- `do-while` → quando precisa rodar pelo menos uma vez antes de checar a condição

---

## 💡 Exemplos típicos

`while`

```java
int contador = 0;
while (contador < 3) {
    System.out.println(contador);
    contador++;
}
```

Esse código imprime:

```bash
0
1
2
```

---

`do-while`

```java
int contador = 0;
do {
    System.out.println(contador);
    contador++;
} while (contador < 3);
```

Mesmo se a condição for falsa, o bloco executa ao menos uma vez.

---

`for`

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Imprime:

```bash
1
2
3
4
5
```

---

## 📎 Observações finais

- Laços de repetição são essenciais para evitar repetição de código e fazer programas mais inteligentes.

- Eles formam a base para algoritmos importantes como processar listas de dados, criar menus que repetem, fazer cálculos cumulativos, e muito mais.