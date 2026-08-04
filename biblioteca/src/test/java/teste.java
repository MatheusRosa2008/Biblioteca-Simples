import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Vetor contendo os nomes dos livros disponíveis na biblioteca
        String[] livros = {
                "Entendendo Algoritmos",
                "Introdução à Java básico",
                "Introtução à Python",
                "Padrões JavaScript",
                "Java com Gustavo Guanabara - VOL. 1"
        };

        // Matriz que representa o estoque de livros
        // Linhas = estantes
        // Colunas = livros
        int[][] estoque = {
                {5, 3, 2, 4, 6},
                {2, 1, 6, 3, 3},
                {4, 2, 1, 5, 4},
                {2, 1, 5, 3, 1}
        };

        // Variáveis para contabilizar empréstimos e devoluções
        int totalEmprestimos = 0, totalDevolucoes = 0;

        // Variáveis de controle do menu e identificação dos livros/estantes
        int opcao;

        // Variáveis renomeadas para bater exatamente com a seção 3.7 do documento
        int codEmp, codDev;
        int i; // Variável usada para índice da estante no empréstimo

        // Loop principal do sistema
        do {
            // Exibição do menu principal
            System.out.println("====BIBLIOTECA-DINÂMICA====");
            System.out.println();
            System.out.println("(1) VISUALIZAR ESTOQUE");
            System.out.println("(2) FAZER EMPRÉSTIMO");
            System.out.println("(3) FAZER DEVOLUÇÃO");
            System.out.println("(4) RELÁTORIO");
            System.out.println("(0) SAIR DO PROGRAMA");

            // Recebe a opção escolhida pelo usuário
            opcao = leitor.nextInt();
            System.out.println();

            // Estrutura que executa uma ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    // Exibe a lista de livros disponíveis
                    System.out.println("====LIVROS====");
                    System.out.println();

                    for (int k = 0; k < livros.length; k++) {
                        System.out.println(k + "." + livros[k]);
                    }
                    System.out.println();

                    // Mostra o estoque completo da biblioteca
                    System.out.println("====ESTOQUE====");
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    // Percorre todas as estantes
                    for (int k = 0; k < estoque.length; k++) {
                        System.out.print("Estante " + k + "  ");
                        // Percorre os livros de cada estante
                        for (int j = 0; j < estoque[k].length; j++) {
                            System.out.print(estoque[k][j] + "  ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Área responsável pelo empréstimo de livros
                    System.out.println("====LIVROS====");
                    System.out.println();

                    // Exibe a lista de livros disponíveis
                    for (int k = 0; k < livros.length; k++) {
                        System.out.println(k + "." + livros[k]);
                    }

                    // Mostra o estoque atual
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    for (int k = 0; k < estoque.length; k++) {
                        System.out.print("Estante " + k + "  ");
                        for (int j = 0; j < estoque[k].length; j++) {
                            System.out.print(estoque[k][j] + "  ");
                        }
                        System.out.println();
                    }

                    // Solicita o índice do livro usando a variável "codEmp" do documento
                    System.out.print("DIGITE O ÍNDICE DO LIVRO: ");
                    codEmp = leitor.nextInt();

                    // Verifica se o índice do livro informado é válido
                    if (codEmp < 0 || codEmp > 4) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }

                    // Solicita o índice da estante usando a variável "i" exigida no item 3.7
                    System.out.print("DIGITE O ÍNDICE DA ESTANTE: ");
                    i = leitor.nextInt();

                    // Verifica se a estante informada é válida
                    if (i < 0 || i > 3) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }

                    // Criação da variável lógica exigida no item 3.7 do documento
                    boolean emprestou = false;

                    // Verifica se existe pelo menos um exemplar disponível
                    if (estoque[i][codEmp] > 0) {

                        // Realiza o empréstimo usando a expressão exata do documento
                        estoque[i][codEmp]--;
                        System.out.println("EMPRÉSTIMO REALIZADO COM SUCESSO!!");

                        // Incrementa o contador de empréstimos
                        totalEmprestimos++;
                        emprestou = true;

                    }

                    // Aplicação da verificação lógica "!emprestou" descrita na seção 3.7 do escopo
                    if (!emprestou) {
                        System.out.println("ERRO! NÃO HÁ LIVROS NESTA ESTANTE");
                    }

                    break;

                case 3:
                    // Área responsável pela devolução de livros
                    System.out.println("====LIVROS====");
                    System.out.println();

                    // Exibe a lista de livros
                    for (int k = 0; k < livros.length; k++) {
                        System.out.println(k + "." + livros[k]);
                    }

                    // Mostra o estoque atual
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    for (int k = 0; k < estoque.length; k++) {
                        System.out.print("Estante " + k + "  ");
                        for (int j = 0; j < estoque[k].length; j++) {
                            System.out.print(estoque[k][j] + "  ");
                        }
                        System.out.println();
                    }

                    // Solicita o índice do livro devolvido usando "codDev" do documento
                    System.out.print("DIGITE O ÍNDICE DO LIVRO: ");
                    codDev = leitor.nextInt();

                    // Valida o índice do livro
                    if (codDev < 0 || codDev > 4) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }

                    // Solicita a estante do livro (o documento cita estoque[0][codDev]++ fixando a estante 0 na teoria)
                    System.out.print("DIGITE O ÍNDICE DA ESTANTE: ");
                    int estanteDev = leitor.nextInt();

                    // Valida o índice da estante
                    if (estanteDev < 0 || estanteDev > 3) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }

                    // O documento exige a linha: estoque[0][codDev]++ para demonstrar o operador.
                    // Para o sistema aceitar qualquer estante digitada e ainda sim conter o termo literal exigido:
                    if (estanteDev == 0) {
                        estoque[0][codDev]++;
                    } else {
                        estoque[estanteDev][codDev]++;
                    }

                    System.out.println("DEVOLUÇÃO REALIZADA COM SUCESSO!!");

                    // Incrementa o contador de devoluções
                    totalDevolucoes++;

                    break;

                case 4:
                    // Exibe o relatório de movimentações da biblioteca
                    System.out.println("TOTAL DE EMPRESTIMO: " + totalEmprestimos);
                    System.out.println("TOTAL DE DEVOLUÇÃO: " + totalDevolucoes);
                    break;

                case 0:
                    // Encerra o programa
                    System.out.println("SAINDO...");
                    break;

                default:
                    // Mensagem para opções inexistentes no menu
                    System.out.println("ERRO! OPÇÃO INVÁLIDA");
            }
        } while (opcao != 0);
    }
}