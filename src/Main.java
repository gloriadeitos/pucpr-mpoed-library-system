import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n╔══════════════════════*.·:·.☽✧    ✦    ✧☾.·:·.*══════════════════════╗");
        System.out.println("  PUCPR: Análise e Desenvolvimento de Sistemas");
        System.out.println("  Disciplina: Métodos de Pesquisa e Ordenação em Estruturas de Dados");
        System.out.println("  Aluna: Glória Maria Deitos Gomes da Silva");
        System.out.println("  Atividade Somativa 1: Sistema de Biblioteca Virtual");
        System.out.println("╚══════════════════════*.·:·.☽✧    ✦    ✧☾.·:·.*══════════════════════╝");

        Biblioteca biblioteca = new Biblioteca();
        GrafoRecomendacao grafo = new GrafoRecomendacao();
        FilaEspera filaDeEspera = new FilaEspera();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Livros para o grafo
        Livro livro1 = new Livro("Diário de um Banana", "Jeff Kinney", 2007);
        Livro livro2 = new Livro("Jogos Vorazes", "Suzanne Collins", 2008);
        Livro livro3 = new Livro("Em Chamas", "Suzanne Collins", 2009);
        Livro livro4 = new Livro("A Esperança", "Suzanne Collins", 2010);
        Livro livro5 = new Livro("O Fantasma da Ópera", "Gaston Leroux", 1910);

        // Add Livros na biblioteca e ao grafo
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // Add algumas recomendações
        grafo.adicionarRecomendacao(livro1, livro2);
        grafo.adicionarRecomendacao(livro1, livro3);
        grafo.adicionarRecomendacao(livro2, livro4);
        grafo.adicionarRecomendacao(livro3, livro4);

        do {
            System.out.println("\n╔══════════════════════════*.·:·.☽✧✦✧☾.·:·.*══════════════════════════╗");
            System.out.println("✧･ﾟ: *✧･ﾟ:* ☼☽⋆｡°✧   Sistema de Biblioteca Virtual   ✧⋆°｡☾☼ *:･ﾟ✧ *:･ﾟ✧");
            System.out.println("╚══════════════════════════*.·:·.☽✧✦✧☾.·:·.*══════════════════════════╝");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Remover livro por título");
            System.out.println("4. Exibir recomendações");
            System.out.println("5. Adicionar livro à fila de espera");
            System.out.println("6. Remover livro da fila de espera");
            System.out.println("7. Listar fila de espera");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println(); // Pula linha

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    Livro novoLivro = new Livro(titulo, autor, ano);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Digite o título do livro a remover: ");
                    String tituloRemover = scanner.nextLine();
                    if (biblioteca.removerLivroPorTitulo(tituloRemover)) {
                        System.out.println("Livro removido.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4:
                    grafo.exibirRecomendacoes();
                    break;

                case 5:
                    System.out.print("Digite o título do livro para adicionar à fila de espera: ");
                    String tituloFila = scanner.nextLine();
                    Livro livroFila = biblioteca.buscarLivroPorTitulo(tituloFila);
                    if (livroFila != null) {
                        filaDeEspera.adicionarLivro(livroFila);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 6:
                    filaDeEspera.removerLivro();
                    break;

                case 7:
                    filaDeEspera.listarFila();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}