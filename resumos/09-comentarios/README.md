# Aula 09 — Comentários

🔗 Link do vídeo: https://youtu.be/2rMT0qRyiYs

---

## 🧠 O que essa aula ensina

Nesta aula o professor mostra **o que são comentários em Java**, como usá-los no código e por que eles são úteis para documentar e entender melhor o que seu programa faz.

Comentários são partes do código que **não são executadas**, e servem para explicar trechos de código ou deixar observações para quem for ler depois.

---

## 📝 Tipos de comentário em Java

### 🟡 1. Comentário de linha única

Usado para **explicar uma linha ou parte específica** do código:

```java
// Este é um comentário de linha única
int idade = 30; // idade da pessoa
```

Tudo que vem após // até o final da linha é ignorado pela JVM.

---

### 🔵 2. Comentário de bloco

Usado quando você quer comentar várias linhas:

```java
/*
  Este é um comentário
  de bloco em Java.
  Pode ocupar várias linhas.
*/
```

É útil para documentar partes maiores de código ou anotações longas.

---

### 🟢 3. Javadoc (documentação)

Comentários especiais usados para gerar documentação automática:

```java
/**
 * Esta classe representa ...
 * @author Seu Nome
 */
public class MinhaClasse {
}
```

Esse tipo de comentário pode ser processado por ferramentas como o javadoc.

---

## 💡 Por que usar comentários

* Explicar lógica complexa que não fica clara só pelo código
* Documentar métodos e classes para quem for usar depois
* Melhorar leitura e manutenção do código
* Facilitar uso de ferramentas de documentação automática

---

## 🧠 Observações importantes

* Comentários não afetam o funcionamento do programa
* Eles ajudam você e outras pessoas a entender o código no futuro
* Não exagere — comentários úteis explicam por que algo é feito, não    apenas o que está feito

## 📎 Exemplo em um programa simples

```java
public class Main {
    public static void main(String[] args) {
        // Imprime uma mensagem no console
        System.out.println("Olá, mundo!");
    }
}
```

Nesse exemplo, o comentário explica o propósito da linha, mas não altera o comportamento.