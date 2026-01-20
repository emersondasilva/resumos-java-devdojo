# Aula 04 — Configurando variáveis de ambiente %JAVA_HOME%

🔗 Link do vídeo: https://youtu.be/xzAESAp_soQ

---

## 🧠 O que essa aula ensina

Essa aula mostra **como configurar as variáveis de ambiente no sistema** para que o Java funcione corretamente no terminal/comandos.

Sem isso, seu computador **não vai conseguir achar o Java** quando você digitar `java` ou `javac`.

---

## 🧩 Por que isso é importante

- Variáveis de ambiente dizem pro sistema **onde encontrar os executáveis** (`java`, `javac`, etc.)
- Sem isso, o terminal **não reconhece os comandos**

---

## 🪜 Passo a passo geral (Windows)

1. Abra o **Explorador de Arquivos**  
2. Vá até onde a **JDK foi instalada**  
   Ex: `C:\Program Files\Java\jdk-15.0.x`  
3. Copie esse caminho  
4. Abra **Configurações do Sistema → Variáveis de Ambiente**  
5. Em **Variáveis do Sistema**:
   - Crie `JAVA_HOME` → cole o caminho da JDK  
   - Edite `Path` → adicione `%JAVA_HOME%\bin`  
6. Salve tudo e feche

---

## 🧪 Como testar depois

```bash
java -version
javac -version
```
Se aparecer a versão correta, está tudo certo.

## ⚠️ Pontos importantes

* Sempre use JAVA_HOME apontando para a raiz da JDK
* Adicionar %JAVA_HOME%\bin ao Path permite rodar java de qualquer pasta

## 📎 Observações

* Linux/macOS usa export JAVA_HOME no .bashrc ou .zshrc
* Passo essencial antes de compilar ou rodar código Java