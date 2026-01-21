# Aula 25 — Estruturas Condicionais pt 05 — Switch

🔗 Link do vídeo: https://youtu.be/AYMtqJSrQTU

---

## 🧠 O que essa aula ensina

Nesta aula o professor apresenta a **estrutura condicional `switch`** em Java, que serve como uma forma **alternativa ao `if / else if`** quando você precisa comparar uma variável com vários valores possíveis.

O `switch` é especialmente útil quando há muitos caminhos diferentes dependendo do valor de uma variável, deixando o código **mais claro e organizado**.

---

## 📌 Estrutura do `switch`

A forma básica de um `switch` é:

```java
switch (expressao) {
    case valor1:
        // código quando expressao == valor1
        break;
    case valor2:
        // código quando expressao == valor2
        break;
    ...
    default:
        // código quando nenhum valor combina
}
```

* A expressão dentro do `switch` geralmente é um `int`, `char`, `String` ou enum
* Cada `case` compara a expressão com um valor
* `break` evita que os casos “caiam” um no outro
* `default` serve como fallback quando nenhuma condição é satisfeita

## 🧪 Exemplo prático

Imagine que você quer mostrar o dia da semana baseado em um número:

```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda");
        break;
    case 3:
        System.out.println("Terça");
        break;
    default:
        System.out.println("Dia inválido");
}
```

Nesse exemplo:

* 3 corresponde a “Terça”
* O bloco de código dentro de case 3 será executado
* break interrompe o fluxo depois de encontrar um caso verdadeiro

---

## 🧠 Por que usar `switch`

* Deixa o código mais limpo do que vários `else if`
* É ideal quando a variável pode assumir vários valores discretos
* A leitura do código fica mais fácil para quem revisa sua lógica

---

## 💡 Dicas importantes

* Sem `break`, o Java continua executando os próximos cases mesmo após encontrar um match

* O `default` é opcional, mas recomendado para cobrir valores não previstos

* `switch` funciona melhor quando você tem muitas comparações simples

---

## 📎 Observações

O `switch` é uma estrutura comum em programas que precisam trabalhar com múltiplas opções fixas, como:

* menus de usuário

* seleção de casos de uso

* interpretação de comandos ou respostas

Ele simplifica muitos `if / else if` longos e deixa o código visualmente mais claro.