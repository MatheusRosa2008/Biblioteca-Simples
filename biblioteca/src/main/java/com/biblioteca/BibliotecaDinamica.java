package com.biblioteca;

import java.util.Scanner;

public class BibliotecaDinamica {
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
        int codigoLivro, codigoEstante;

        // Loop principal do sistema
        do {
            // Exibição do menu principal
            System.out.println("====BIBLIOTECA-DINÂMICA====\n");
            System.out.println("(1) VISUALIZAR ESTOQUE");
            System.out.println("(2) FAZER EMPRÉSTIMO");
            System.out.println("(3) FAZER DEVOLUÇÃO");
            System.out.println("(4) RELATÓRIO");
            System.out.println("(0) SAIR DO PROGRAMA");
            // Recebe a opção escolhida pelo usuário
            System.out.print("DIGITE:");
            opcao = leitor.nextInt();
            
            // Estrutura que executa uma ação de acordo com a opção escolhida
            switch (opcao) {
                case 1:
                    // Exibe a lista de livros disponíveis
                    System.out.println("====LIVROS====\n");
                    
                    for (int i = 0; i < livros.length; i++) {
                        System.out.println(i + "." + livros[i]);
                    }
                    // Mostra o estoque completo da biblioteca
                    System.out.println("\n====ESTOQUE====");
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    // Percorre todas as estantes
                    for (int i = 0; i < estoque.length; i++) {
                        System.out.print("Estante " + i + "  ");
                        // Percorre os livros de cada estante
                        for (int j = 0; j < estoque[i].length; j++) {
                            System.out.print(estoque[i][j] + "  ");
                        }

                        System.out.println();
                    }

                    System.out.println();
                    break;
                
                case 2:
                    // Área responsável pelo empréstimo de livros
                    System.out.println("====LIVROS====\n");
                    System.out.println();

                    // Exibe a lista de livros disponíveis
                    for (int i = 0; i < livros.length; i++) {
                        System.out.println(i + "." + livros[i]);
                    }
                    // Mostra o estoque atual
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    for (int i = 0; i < estoque.length; i++) {
                        System.out.print("Estante " + i + "  ");

                        for (int j = 0; j < estoque[i].length; j++) {
                            System.out.print(estoque[i][j] + "  ");
                        }

                        System.out.println();
                    }
                    // Solicita o índice do livro
                    System.out.print("DIGITE O ÍNDICE DO LIVRO: ");
                    codigoLivro = leitor.nextInt();

                    // Verifica se a estante informada é válida
                    if (codigoLivro < 0 || codigoLivro > 4) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }
                    // Solicita o índice da estante
                    System.out.print("DIGITE O ÍNDICE DA ESTANTE: ");
                    codigoEstante = leitor.nextInt();

                    // Verifica se a estante informada é válida
                    if (codigoEstante < 0 || codigoEstante > 3) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }
                        
                    // Verifica se existe pelo menos um exemplar disponível
                    if (estoque[codigoEstante][codigoLivro] > 0) {

                        // Realiza o empréstimo diminuindo 1 unidade do estoque
                        estoque[codigoEstante][codigoLivro]--;
                        System.out.println("EMPRÉSTIMO REALIZADO COM SUCESSO!!");

                        // Incrementa o contador de empréstimos
                        totalEmprestimos++;

                    } else {
                        // Mensagem caso não haja livros disponíveis
                        System.out.println("ERRO! NÃO HÁ LIVROS NESTA ESTANTE");
                        break;
                    }

                    break;

                case 3:
                    // Área responsável pela devolução de livros
                    System.out.println("====LIVROS====/n");
                    
                    // Exibe a lista de livros
                    for (int i = 0; i < livros.length; i++) {
                        System.out.println(i + "." + livros[i]);
                    }

                    // Mostra o estoque atual
                    System.out.println("\n              LIVROS");
                    System.out.println("ÍNDICE     0  1  2  3  4");

                    for (int i = 0; i < estoque.length; i++) {
                        System.out.print("Estante " + i + "  ");

                        for (int j = 0; j < estoque[i].length; j++) {
                            System.out.print(estoque[i][j] + "  ");
                        }

                        System.out.println();
                    }
                        // Solicita o índice do livro devolvido
                        System.out.print("DIGITE O ÍNDICE DO LIVRO: ");
                        codigoLivro = leitor.nextInt();

                    // Valida o índice do livro
                    if (codigoLivro < 0 || codigoLivro > 4) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }

                    // Solicita a estante do livro
                    System.out.print("DIGITE O ÍNDICE DA ESTANTE: ");
                    codigoEstante = leitor.nextInt();

                    // Valida o índice da estante
                    if (codigoEstante < 0 || codigoEstante > 3) {
                        System.out.println("ERRO! ÍNDICE INVÁLIDO");
                        System.out.println();
                        break;
                    }
                    
                    // Adiciona uma unidade ao estoque
                    estoque[codigoEstante][codigoLivro]++;
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