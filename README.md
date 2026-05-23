# 🎮 Jogo de Adivinhação em Java

Um jogo simples e interativo de terminal desenvolvido em Java, onde o desafio é adivinhar um número secreto gerado aleatoriamente pelo sistema.

## 🚀 Como Funciona o Jogo

1. O sistema escolhe um número aleatório entre **1 e 100**.
2. O jogador faz palpites no terminal para tentar adivinhar o número.
3. A cada palpite incorreto, o jogo dá uma dica se o número secreto é **MAIOR** ou **MENOR**.
4. O jogo continua até que o jogador acerte o número, exibindo ao final o total de tentativas utilizadas.

## 🛡️ Diferenciais do Código

* **Tratamento de Erros (`Exception Handling`)**: O sistema utiliza um bloco `try-catch` para capturar entradas inválidas (`InputMismatchException`). Se o usuário digitar letras ou caracteres especiais, o programa não quebra; ele exibe uma mensagem de alerta e limpa o buffer para a próxima tentativa.
* **Gerenciamento de Recursos**: Utiliza o formato *try-with-resources* para garantir que o `Scanner` seja fechado automaticamente, evitando vazamentos de memória (*resource leaks*).

## 🛠️ Tecnologias Utilizadas

* **Java SE** (JDK 8 ou superior)
* `java.util.Random` - Para geração do número aleatório.
* `java.util.Scanner` - Para leitura dos palpites no terminal.

## 📦 Como Rodar o Projeto

### Pré-requisitos
Você precisará ter o **JDK (Java Development Kit)** instalado em sua máquina.

### Passo a Passo
1. Faça o download ou clone este repositório:
   ```bash
   git clone [https://github.com/Kevintav2025/SistemaJogo]
