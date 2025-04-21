import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GrafoRecomendacao {
    private Map<Livro, Set<Livro>> grafo;

    public GrafoRecomendacao() {
        grafo = new HashMap<>();
    }

    // Add um livro + suas recomendações
    public void adicionarLivro(Livro livro) {
        grafo.putIfAbsent(livro, new HashSet<>());
    }

    // Add uma recomendação de um livro p/ outro
    public void adicionarRecomendacao(Livro livro, Livro livroRecomendado) {
        // Se o livro já existe no grafo...
        grafo.putIfAbsent(livro, new HashSet<>());
        grafo.putIfAbsent(livroRecomendado, new HashSet<>());

        // Então vai add recomendação
        grafo.get(livro).add(livroRecomendado);
    }

    // Obtém as recomendações de um livro
    public Set<Livro> obterRecomendacoes(Livro livro) {
        return grafo.getOrDefault(livro, new HashSet<>());
    }

    // Exibe todas recomendações
    public void exibirRecomendacoes() {
        for (Map.Entry<Livro, Set<Livro>> entry : grafo.entrySet()) {
            System.out.println("*✧･ﾟ* " + entry.getKey() + " pode ser recomendado com:");
            for (Livro livro : entry.getValue()) {
                System.out.println("  - " + livro);
            }
            System.out.println(); // Pula linha
        }
    }
}