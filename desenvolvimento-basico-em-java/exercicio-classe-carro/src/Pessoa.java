public class Pessoa {
    private final String nome;
    private static int n = 1;

    public String getNome() {
        return nome;
    }

    Pessoa() {
        this.nome = "Pessoa " + n++;
    }
}
