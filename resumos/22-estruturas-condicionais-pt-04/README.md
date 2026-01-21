# Aula 23 — Estruturas Condicionais pt 04 — Tabela Verdade e exercício

🔗 Link do vídeo: https://youtu.be/Y3ODYE3npgo

---

## 🧠 O que essa aula ensina

Nesta aula o professor explica o conceito de **tabela verdade**, que é uma forma de representar todos os **resultados possíveis de expressões lógicas** usando operadores relacionais e lógicos (`&&`, `||`, `!`).  
Esse tipo de tabela ajuda você a **visualizar como combinações de condições** se comportam e qual será o resultado final (`true` ou `false`).

A aula também inclui um **exercício prático** usando esses conceitos, para reforçar o entendimento e te fazer praticar as avaliações lógicas passo a passo.

---

## 📌 O que é tabela verdade

Uma **tabela verdade** mostra:

- todas as possíveis combinações de valores `true` / `false` para duas ou mais expressões;
- o resultado final da expressão lógica combinada.

Por exemplo, com duas variáveis lógicas `A` e `B`, a tabela verdade do operador AND (`&&`) é:

| A       | B       | A `AND` B |
|---------|---------|--------|
| true    | true    | true   |
| true    | false   | false  |
| false   | true    | false  |
| false   | false   | false  |

E a do operador OR (`||`):

| A       | B       | A `OR` B |
| ------- | ------- | ------ |
| true    | true    | true   |
| true    | false   | true   |
| false   | true    | true   |
| false   | false   | false  |

---

## 🧪 Por que isso importa

✔️ A tabela verdade **mostra claramente quando uma expressão é verdadeira ou falsa**.  
✔️ Ela te ajuda a entender combinações complexas de condições.  
✔️ É útil quando se trabalha com **condicionais compostas**, como:

```java
if ((idade >= 18 && temIngresso) || ehVip) { ... }
```

Nesse caso, uma tabela verdade ajuda a saber em que combinações a expressão final será true ou false.

---

## 🧠 Observações importantes

*  Tabela verdade pode ser usada com qualquer operador lógico (`&&`, `||`, `!`).
* Ajuda muito na hora de depurar condições complexas.
* É uma forma sistemática de raciocinar sobre lógica combinada.
* Melhor que “achar intuitivamente” o resultado; aqui você vê todos os casos possíveis.