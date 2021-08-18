import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    public List<Curso> list() {
        List<Curso> cursos = new ArrayList<>();

        try(Connection con = this.getConnection()) {
            ResultSet results = con.prepareStatement("SELECT * FROM curso").executeQuery();

            while(results.next()) {
                cursos.add(new Curso(
                        results.getInt("id"),
                        results.getString("nome"),
                        results.getInt("duracao_horas")));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return cursos;
    }

    public Curso getById(int id) {
        Curso curso = null;

        try(Connection con = this.getConnection()) {
            PreparedStatement statement = con.prepareStatement("SELECT * From curso WHERE id = ?");
            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();

            if(result.next()) {
                curso = new Curso(
                        result.getInt("id"),
                        result.getString("nome"),
                        result.getInt("duracao_horas"));
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

        return curso;
    }

    public void create(Curso curso) {
        try(Connection con = this.getConnection()) {
            PreparedStatement statement = con.prepareStatement(
                    "INSERT INTO curso(nome, duracao_horas) " +
                        "VALUES (?, ?);");

            statement.setString(1, curso.getNome());
            statement.setInt(2, curso.getDuracaoHoras());

            System.out.println(statement.executeUpdate() + " registro foi inserido (Curso{nome=" + curso.getNome() + "}).");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int id) {
        try(Connection con = this.getConnection()) {
            PreparedStatement statement = con.prepareStatement("DELETE FROM curso WHERE id = ?");
            statement.setInt(1, id);

            System.out.println(statement.executeUpdate() + " registro (Curso{id=" + id + "}) deletado com sucesso.");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Curso curso) {
        try(Connection con = this.getConnection()) {
            PreparedStatement statement = con.prepareStatement(
                    "UPDATE curso " +
                        "SET nome = ?, duracao_horas = ? " +
                        "WHERE id = ?");
            statement.setString(1, curso.getNome());
            statement.setInt(2, curso.getDuracaoHoras());
            statement.setInt(3, curso.getId());

            System.out.println(statement.executeUpdate() + " registro (Curso{nome=" + curso.getNome() + "}) atualizado com sucesso.");

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void createTable() {
        try(Connection con = this.getConnection()) {
            con.prepareStatement("DROP TABLE curso;").executeUpdate();
            con.prepareStatement("CREATE TABLE curso (" +
                    "id INT NOT NULL AUTO_INCREMENT," +
                    "nome VARCHAR(80) NOT NULL," +
                    "duracao_horas INT NOT NULL," +
                    "PRIMARY KEY (id)," +
                    "UNIQUE INDEX id_UNIQUE (id ASC) VISIBLE);").executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/exercicio_jdbc",
                "root",
                "password");
    }

    CursoDAO() {
        createTable();
    }
}