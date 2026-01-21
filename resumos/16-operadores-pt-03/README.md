# Aula 17 — Operadores pt 03 — Lógicos AND

🔗 Link do vídeo: https://youtu.be/cT6sw-Pw4l0

---

## 🧠 O que essa aula ensina

Nesta aula o professor explica **os operadores lógicos em Java**, começando pelo operador **AND lógico** (`&&`).  
Operadores lógicos são usados para **combinar várias condições**, retornando um valor booleano (`true` ou `false`).

---

## 📌 O operador Lógico AND (`&&`)

O operador **AND lógico** só retorna **true** quando **todas as condições comparadas forem verdadeiras**:

condição1 && condição2:

* Se **ambas forem true**, o resultado é true  
* Se **uma ou ambas forem false**, o resultado é false

---

## 🧪 Exemplo de uso

Imagina que você quer verificar se uma pessoa pode entrar num evento que exige:

- idade >= 18  
- ingresso válido

```java
int idade = 20;
boolean temIngresso = true;

boolean podeEntrar = (idade >= 18) && (temIngresso);
System.out.println(podeEntrar); // true
```

Neste caso:

* idade >= 18 → true
* temIngresso → true
* Resultado do AND: true && true → true

Se qualquer uma das duas fosse false, o resultado seria false:

```java
int idade2 = 16;
boolean temIngresso2 = true;

System.out.println((idade2 >= 18) && temIngresso2); // false
```

---

## 📌 Por que isso importa

Você vai usar operadores lógicos **em quase todos os programas que exigem múltiplas condições**, especialmente dentro de estruturas de decisão como `if`, `else if`, `switch`, e controles de fluxo em geral.

---

## 💡 Pontos importantes

* `&&` representa E lógico
* Todas as expressões à esquerda e à direita precisam ser true para o resultado ser true
* Se uma condição já for false, o Java nem verifica a outra (curto-circuito) — o que pode evitar erros ou execução desnecessária

---

## 📎 Observações

* Operadores lógicos são fundamentais para construir condições compostas

* Eles aparecem junto com os operadores relacionais em estruturas de `if` e loops