import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Livro> livros;

    public Biblioteca() {
        livros = new LinkedList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método p/ mostrar tds os livros da biblioteca
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("\n╔══════════*✧･ﾟ:*══════════╗");
            System.out.println("  A biblioteca está vazia.");
            System.out.println("╚══════════*✧･ﾟ:*══════════╝");
        } else {
            System.out.println("\n╔════════*✧･ﾟ:*════════╗");
            System.out.println("  Livros disponíveis:");
            System.out.println("╚════════*✧･ﾟ:*════════╝");
            for (Livro livro : livros) {
                System.out.println("- " + livro);
            }
        }
    }

    public boolean removerLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                return true;
            }
        }
        return false;
    }

    // Método de busca para facilitar a adição na fila ou histórico
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}