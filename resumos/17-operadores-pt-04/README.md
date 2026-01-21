# Aula 18 — Operadores pt 04 — Lógicos OR

🔗 Link do vídeo: https://youtu.be/ELcO4DN7lxw

---

## 🧠 O que essa aula ensina

Nesta aula o professor explica o **operador lógico OR** em Java, que serve para **combinar condições** de modo que o resultado seja verdadeiro se **qualquer uma das condições for verdadeira**.  
Esse operador é usado quando você quer permitir mais de uma condição válida ao mesmo tempo.

---

## 📌 O operador OR (`||`)

- Representado pelos caracteres `||`  
- Ele retorna:
  - **true** se **pelo menos uma das condições for true**
  - **false** somente se **todas as condições forem false**

```plaintext
condição1 || condição2
```

---

## 🧪 Exemplos de uso

* Exemplo simples com valores

```java
int idade = 16;
boolean temAutorizacao = true;

boolean podeEntrar = (idade >= 18) || temAutorizacao;
System.out.println(podeEntrar); // true
```

Nesse caso:

* idade >= 18 → false
* temAutorizacao → true
* Resultado de `||` → true

## 📌 Outro exemplo

Java permite combinar várias expressões OR:

```java
int x = 5;
int y = 10;

boolean resultado = (x > 8) || (y < 20); 
System.out.println(resultado); // true
```

Aqui:

* x > 8 → false
* y < 20 → true
* Então o operador OR retorna true

---

## 💡 Por que isso importa

Operadores lógicos são essenciais quando você precisa testar condições alternativas, como:

* permitir acesso se uma das condições for satisfeita
* validar entrada do usuário com mais de uma regra possível
* escrever lógica clara em `if`, `while`, `for`, etc.

---

## 🧠 Observações importantes

* OR lógico (`||`) só é false quando todas as condições forem false

* Ele é frequentemente usado junto com operadores relacionais

* OR é diferente de AND (`&&`):
  * && exige todas as condições verdadeiras
  * `||` exige pelo menos uma verdadeira

## 📎 Exemplos na prática

```java
boolean temCarteira = false;
boolean temPassagem = true;

if (temCarteira || temPassagem) {
    System.out.println("Você pode embarcar!");
} else {
    System.out.println("Você não pode embarcar!");
}
```

Nesse trecho:

* temCarteira → false
* temPassagem → true
* OR → true → “Você pode embarcar!” fica impresso

## 📌 Dica final

Uma boa maneira de entender `||` é pensar assim:

“Pelo menos uma dessas tem que ser verdadeira”

Esse operador é usado o tempo todo em condições reais de programas: formulários, jogos, regras de negócio, filtros, e muito mais.