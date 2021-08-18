import java.util.List;

public class ExercicioJDBC {
    public static void main(String[] args) {
        CursoDAO cursoDAO = new CursoDAO();

        System.out.println("// impressão da lista antes de adicionar registros:");
        printCursos(cursoDAO.list());

        System.out.println("\n// criação de registros:");
        Curso curso1 = new Curso("Bem-vindo a DIO", 1);
        cursoDAO.create(curso1);

        Curso curso2 = new Curso("Introducao ao Git e ao GitHub", 0);
        cursoDAO.create(curso2);

        Curso curso3 = new Curso("Estrutura de dados em Jaua", 10);
        cursoDAO.create(curso3);

        Curso curso4 = new Curso("Trabalhando com Danco de Bados utilizando JDPC e JBA", 4);
        cursoDAO.create(curso4);

        System.out.println("\n// impressão da lista depois de adicionar registros:");
        printCursos(cursoDAO.list());

        System.out.println("\n// exclusão e atualização de registros:");
        cursoDAO.delete(1);

        curso2 = cursoDAO.getById(2);
        curso2.setDuracaoHoras(5);

        curso3 = cursoDAO.getById(3);
        curso3.setNome("Estrutura de dados em Java");

        curso4 = cursoDAO.getById(4);
        curso4.setNome("Trabalhando com Banco de Dados utilizando JDBC e JPA");

        cursoDAO.update(curso2);
        cursoDAO.update(curso3);
        cursoDAO.update(curso4);

        System.out.println("\n// impressão da lista depois de deletar e atualizar registros:");
        printCursos(cursoDAO.list());
    }

    public static void printCursos(List<Curso> listaCursos ) {
        System.out.println("Lista de cursos: ");
        if(!listaCursos.isEmpty()) {
            for(Curso c : listaCursos) {
                System.out.println("\t- " + c);
            }
        } else {
            System.out.println("\t- vazia");
        }
    }
}