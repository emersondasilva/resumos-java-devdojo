# Aula 05 — Executando compilação manualmente

🔗 Link do vídeo: https://youtu.be/E64JTsEyXCM

---

## 🧠 O que essa aula ensina

Como **compilar e executar um programa Java manualmente** usando o terminal (sem IDE).

---

## 📎 Exemplo de arquivo `.java`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Java!");
    }
}
```

## 🪜 Passo a passo

1. Abrir terminal/cmd

2. Ir para a pasta do arquivo .java

```bash
cd C:\projetos\meujava
```

3. Compilar:

```bash
javac Main.java
```

Gera `Main.class` (bytecode).

4. Executar:

```bash
java Main
```

Programa roda e imprime "Olá Java!"

## 📌 Pontos importantes

* O nome da classe deve combinar com o arquivo
* Comando de execução não usa .class
* Compilação precisa dar certo antes de executar

## 📎 Observações

Entender a compilação manual ajuda a compreender o que a IDE faz por trás.