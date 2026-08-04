#  Biblioteca Simples (Java)

Um sistema em linha de comando (CLI) desenvolvido em Java para gerenciamento básico de estoque, empréstimos e devoluções de livros em estantes. 

Projeto desenvolvido como parte da disciplina de Algoritmos e Programação do 1º período do curso de Engenharia de Software.

---

##  Sobre o Projeto

O objetivo principal deste projeto é aplicar os conceitos fundamentais de lógica de programação e estruturas de dados básicas, utilizando matrizes para simular o armazenamento físico de livros distribuídos em estantes.

###  Conceitos Aplicados:
* Vetores (Arrays unidimensionais): Mapeamento e identificação dos nomes dos livros por índices.
* Matrizes (Arrays bidimensionais): Controle de estoque por localização física (linhas representam as estantes e colunas os livros).
* Estruturas de Repetição (do-while, for): Fluxo principal do programa e exibição tabulada dos dados.
* Estruturas Condicionais (switch-case, if-else): Navegação pelo menu principal, validação de entradas do usuário e verificação de disponibilidade em estoque.

---

##  Funcionalidades

- Visualizar Estoque: Exibe a lista de livros cadastrados com seus respectivos códigos e a quantidade de exemplares disponíveis em cada estante.
- Fazer Empréstimo: Permite ao usuário escolher um livro e uma estante. O sistema decrementa a quantidade do estoque e valida a disponibilidade do exemplar.
- Fazer Devolução: Incrementa o estoque do livro retornado na estante selecionada.
- Relatório de Movimentação: Apresenta o total acumulado de empréstimos e devoluções realizados na sessão.
- Validação de Entradas: Impede a seleção de opções inválidas ou estantes/livros fora dos limites definidos.

---

##  Tecnologias Utilizadas

* Linguagem: Java (JDK 8 ou superior)
* Entrada de Dados: java.util.Scanner

---

##  Como Executar o Projeto

### Pré-requisitos
Ter o Java JDK instalado em sua máquina.

### Passo a Passo

1. Clone este repositório:
   git clone https://github.com/MatheusRosa2008/Biblioteca-Simples

2. Acesse a pasta do projeto:
   cd biblioteca-simples

3. Compile o arquivo Java:
   javac com/biblioteca/BibliotecaDinamica.java

4. Execute a aplicação:
   java com.biblioteca.BibliotecaDinamica

---

##  Estrutura da Matriz de Estoque

Visualização de como as informações de estoque são organizadas internamente:

+-------------------+-----------------------+---------------------+---------------------+--------------------+--------------------+
| Estante \ Livro   | [0] Entendendo Algori.| [1] Introd. à Java  | [2] Introd. à Python| [3] Padrões JS     | [4] Java Guanabara |
+-------------------+-----------------------+---------------------+---------------------+--------------------+--------------------+
| Estante 0         | 5                     | 3                   | 2                   | 4                  | 6                  |
| Estante 1         | 2                     | 1                   | 6                   | 3                  | 3                  |
| Estante 2         | 4                     | 2                   | 1                   | 5                  | 4                  |
| Estante 3         | 2                     | 1                   | 5                   | 3                  | 1                  |
+-------------------+-----------------------+---------------------+---------------------+--------------------+--------------------+

---

##  Autor

Desenvolvido por Matheus Rosa
Estudante de Engenharia de Software — 2º Período
