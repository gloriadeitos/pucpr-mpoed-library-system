public class Livro {
    // Info dos livros
    private String titulo;
    private String autor;
    private int ano;

    // Construtor p/ criar os livro com as infos
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Método p/ pegar titulo, autor e ano
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // Concatena os dados p/ mostrar no terminal
    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + ano + ")";
    }
}