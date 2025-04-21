import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private Queue<Livro> fila;

    public FilaEspera() {
        fila = new LinkedList<>();
    }

    public void adicionarLivro(Livro livro) {
        fila.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " adicionado à fila de espera.");
    }

    public Livro removerLivro() {
        if (fila.isEmpty()) {
            System.out.println("A fila de espera está vazia.");
            return null;
        } else {
            Livro livro = fila.poll();
            System.out.println("Livro " + livro.getTitulo() + " retirado da fila de espera.");
            return livro;
        }
    }

    public void listarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila de espera está vazia.");
        } else {
            System.out.println("Livros na fila de espera:");
            for (Livro livro : fila) {
                System.out.println("- " + livro);
            }
        }
    }
}