# Aula 16 — Operadores pt 02 — Relacionais

🔗 Link do vídeo: https://youtu.be/U390IaCtOUk

---

## 🧠 O que essa aula ensina

Nesta aula o professor te mostra os **operadores relacionais em Java**, que são usados para **comparar dois valores** e retornar um resultado do tipo **boolean** (`true` ou `false`).  
Operadores relacionais não fazem cálculos matemáticos — **fazem comparações lógicas** entre valores e ajudam você a decidir caminhos no código baseado nesses resultados.

---

## 📌 Principais operadores relacionais

| Operador | O que faz                                      |
|----------|------------------------------------------------|
| `==`     | verifica se dois valores são **iguais**         |
| `!=`     | verifica se são **diferentes**                  |
| `>`      | verifica se o valor da esquerda é **maior que** |
| `<`      | verifica se é **menor que**                     |
| `>=`     | maior ou **igual a**                            |
| `<=`     | menor ou **igual a**                            |

Esses operadores retornam sempre **true** ou **false**.

---

## 🧪 Exemplos de uso

### 🧠 Comparando números

```java
int a = 10;
int b = 20;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b);   // false
System.out.println(a < b);   // true
System.out.println(a >= 10); // true
System.out.println(b <= 20); // true
```

---

## 💡 Como funciona na prática

* `==`: compara igualdade
* `!=`: nega a igualdade
* `>` e `<`: compara grandeza
* `>=` e `<=`: compara com possibilidade de igualdade

---

## 📌 Por que aprender operadores relacionais

Operadores relacionais são usados em:

* Estruturas de decisão como if, else e loops
* Verificar condições antes de executar blocos de código
* Criar lógica que depende de comparação entre valores

Por exemplo, validar se a idade é suficiente para cadastro ou se uma nota é maior que a média.

## 📎 Observações

* Operadores relacionais sempre retornam um boolean

* Eles são essenciais para controle de fluxo

* Os comparadores não mudam os valores das variáveis — só retornam true/false