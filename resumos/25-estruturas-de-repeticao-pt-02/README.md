# Aula 29 — Estruturas de Repetição pt 02 — Break

🔗 Link do vídeo: https://youtu.be/bcv-cgpw7Ak

---

## 🧠 O que essa aula ensina

Nesta aula o professor mostra como usar o comando **`break`** dentro de **laços de repetição** em Java.

O `break` é um **controle de fluxo** que faz o programa **interromper imediatamente um loop**, parando a repetição e seguindo para o próximo trecho de código após o laço.

---

## 📌 Quando usar `break`

O `break` é útil quando você está dentro de um loop (`for`, `while` ou `do-while`) e quer:

- sair do loop **antes da condição terminar**  
- interromper repetição quando encontra um item desejado  
- evitar laços infinitos em determinadas situações

Ele serve principalmente para **parar a repetição mais interna** no momento em que alguma condição específica ocorre.

---

## 🧪 Exemplo básico

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // sai do loop quando i == 5
    }
    System.out.println(i);
}
```

Saída:

```bash
1
2
3
4
```


Explicação:

- Quando `i` chega em 5, a condição do `if` é satisfeita
- O `break` interrompe o loop imediatamente
- O laço termina sem imprimir os números após 4 

---

## 📌 Onde funciona o break

O comando break pode ser usado em:

- `for` loops
- `while` loops
- `do-while` loops
- `switch` / case

No contexto de laços, o `break` sai do loop;

Já em um `switch`, ele sai do caso atual e evita a execução contínua dos próximos cases.

---

## 💡 Dicas importantes

- Se o loop tiver vários níveis (aninhados), o `break` só afeta o loop mais interno onde ele aparece.
- Cuidado para não usar o `break` de forma que o loop pare **sem controle**, gerando comportamento inesperado.

🧠 Por que isso importa

O `break` é uma ferramenta fundamental para você:

* otimizar loops
* melhorar performance evitando execuções desnecessárias
* controlar fluxo de repetição com precisão

Ele aparece muito em programas reais quando os laços precisam parar antes da condição final, como em buscas, verificações e lógicas de parada.

