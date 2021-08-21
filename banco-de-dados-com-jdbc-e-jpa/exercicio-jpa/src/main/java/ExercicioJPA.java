import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

public class ExercicioJPA {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager manager = factory.createEntityManager();

        insertData(manager);

        System.out.println("// consulta SQL nativa");
        StringBuilder nomesAlunos = new StringBuilder("Alunos matriculados no curso Java Developer:");

        for(String nome: (List<String>) manager
                .createNativeQuery("SELECT nome FROM aluno WHERE id IN " +
                        "(SELECT id_aluno FROM matricula WHERE id_curso = 1)")
                .getResultList()) {
            nomesAlunos.append("\n\t- ").append(nome);
        }
        System.out.println(nomesAlunos);

        System.out.println("// consulta JPQL");
        nomesAlunos.replace(0, nomesAlunos.length(),"Alunos matriculados no curso Fullstack Java and Angular:");

        for(String nome: (List<String>) manager
                .createQuery("SELECT a.nome FROM Aluno a JOIN a.cursos c WHERE c.id = :idCurso")
                .setParameter("idCurso", 2)
                .getResultList()) {
            nomesAlunos.append("\n\t- ").append(nome);
        }
        System.out.println(nomesAlunos);

        System.out.println("// consulta com Criteria Builder");
        int n = (int)(Math.random()*10.0);
        while(n > 6) {
            n--;
        }
        CriteriaQuery<Aluno> critQuery = manager.getCriteriaBuilder().createQuery(Aluno.class);
        critQuery.from(Aluno.class);
        String nomeSorteado = manager.createQuery(critQuery).getResultList().get(n).getNome();

        System.out.println("O aluno sorteado foi:\n\t- " + nomeSorteado);
    }

    private static void insertData(EntityManager manager) {
        manager.getTransaction().begin();

        List<Curso> cursos = new ArrayList<>();
        List<Aluno> alunos = new ArrayList<>();

        for(String nome : new String[]{"Java Developer", "Fullstack Java and Angular"}) {
            Curso curso = new Curso(nome);
            cursos.add(curso);
            manager.persist(curso);
        }
        for(String nome : new String[]{"Joaquim", "Bernardo", "Maria", "Bianca", "José", "Helena"}) {
            Aluno aluno = new Aluno(nome);
            alunos.add(aluno);
            manager.persist(aluno);
        }
        for(int i = 0, j = 0, alunosSize = alunos.size();
            i < alunosSize;
            i++, j = i > (alunosSize - 1) / 2 ? 1 : j) {
            Aluno aluno = alunos.get(i);
            aluno.addCurso(cursos.get(j));
            manager.persist(aluno);
        }

        manager.getTransaction().commit();
    }
}