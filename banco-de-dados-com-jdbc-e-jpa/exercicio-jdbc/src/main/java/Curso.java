public class Curso {
    private final int id;
    private String nome;
    private int duracaoHoras;

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public int getDuracaoHoras() {
        return this.duracaoHoras;
    }

    Curso(int id, String nome, int duracaoHoras) {
        this.id = id;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    Curso(String nome, int duracaoHoras) {
        this.id = 0;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString() {
        return "Curso{id=" + this.id + ", nome=" + this.nome + ", duracao_horas=" + this.duracaoHoras + "}";
    }
}
