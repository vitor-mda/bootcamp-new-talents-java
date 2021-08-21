import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "alunos", fetch = FetchType.EAGER)
    private Set<Curso> cursos;

    Aluno(String nome) {
        this.nome = nome;
        this.cursos = new HashSet<>();
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Curso> getCursos() {
        return this.cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.getAlunos().add(this);
    }
}
