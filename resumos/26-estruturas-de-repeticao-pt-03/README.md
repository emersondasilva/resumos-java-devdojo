# Aula 31 — Estruturas de Repetição pt 03 — Continue

🔗 Link do vídeo: https://youtu.be/f65R-lQ4NpY

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta o comando **`continue`** em Java, que é usado dentro de **laços de repetição** (`for`, `while`, `do-while`) para **pular a iteração atual e seguir para a próxima**, sem encerrar o loop.

Ele é diferente do `break`:  
- **`break`** termina o loop completamente  
- **`continue`** *ignora o restante do bloco atual* e vai para a próxima iteração

---

## 📌 Quando usar `continue`

Use o `continue` quando você quer **ignorar um ou mais passos dentro do loop** quando uma condição acontecer, mas **continuar repetindo o laço normalmente**.  
Isso é útil para:
- pular números que não te interessam  
- evitar lógica dentro de blocos que não precisam ser executados em todas as iterações  
- manter o loop ativo mas saltar certas ações

---

## 🧪 Exemplos típicos

### 🔹 Usando `continue` em um `for`

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // pula quando i for par
    }
    System.out.println(i);
}
```

Resultado esperado:

```bash
1
3
5
7
9
```

➡️ Quando `i` é par, o `continue` faz o loop pular a impressão e ir para o próximo valor.

---

### 🔹 `continue` dentro de `while`

```java
int i = 0;

while (i < 5) {
    i++;
    if (i == 3) {
        continue; // pula quando i vale 3
    }
    System.out.println(i);
}
```

Resultado:

```bash
1
2
4
5
```

Aqui, quando `i == 3`, a linha `System.out.println(i)` é ignorada, mas o loop continua normalmente depois.

---

## 💡 Por que isso importa

- O continue te ajuda a controlar melhor o fluxo dentro de um loop
- Evita a necessidade de else ou condições complexas no meio do laço
- Pode tornar seu código mais claro e legível quando usado corretamente

## 📎 Observações

- O `continue` não termina o loop — ele apenas pula para a próxima iteração.

- Ele funciona com todos os principais tipos de laços: `for`, `while` e `do-while`.

- Muito usado em validações dentro de loops ou quando algumas condições não exigem processamento naquele ciclo.