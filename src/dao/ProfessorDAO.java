package dao;

import model.ProfessorModel;

import java.sql.*;
import java.util.ArrayList;

public class ProfessorDAO {
    private String url = "jdbc:mysql://localhost:3306/senai_banco_academico";
    private String user = "root";
    private String password = "aluno";
    private Connection connection;

    public void addProfessorSQL(ProfessorModel professor, String siglaDisciplina) {
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO professor(codigo, nome, codigo_disciplina, especialidade, data_admissao) VALUES (?,?,?,?,?);";

            PreparedStatement ps = c.prepareStatement(query);

            ps.setString(1, professor.getCodigo());
            ps.setString(2, professor.getNome());
            ps.setString(3, siglaDisciplina);
            ps.setString(4, professor.getEspecialidade());
            ps.setString(5, professor.getDataAdmissao());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<ProfessorModel> listarProfessoresSQL() {
        ArrayList<ProfessorModel> professores = new ArrayList<>();
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM professor;";

            PreparedStatement ps = c.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nome = rs.getString("nome");
                String codigoDisciplina = rs.getString("codigo_diciplina");
                String especialidade = rs.getString("especialidade");
                String dataAdmissao = rs.getString("data_admissao");
                ProfessorModel pm = new ProfessorModel(codigo, nome, especialidade, dataAdmissao, codigoDisciplina);
                professores.add(pm);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professores;
    }

    public ProfessorModel listarProfessorSQL(String codigo) {
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM professor WHERE codigo = ?;";
            PreparedStatement ps = c.prepareStatement(query);

            ps.setString(1, codigo);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sigla = rs.getString("codigo");
                String nome = rs.getString("nome");
                String codigoDisciplina = rs.getString("codigo_disciplina");
                String especialidade = rs.getString("especialidade");
                String dataAdmissao = rs.getString("data_admissao");

                ProfessorModel professor = new ProfessorModel(sigla, nome, especialidade, dataAdmissao, codigoDisciplina);
                return professor;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteProfessorSQL(String codigo) {
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM professor WHERE codigo = ?;";

            PreparedStatement ps = c.prepareStatement(query);

            ps.setString(1, codigo);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarProfessorSQL(String codigo, String nome, String especialidade) {
        try (Connection c = DriverManager.getConnection(url, user, password)){
            String query = "UPDATE professor SET nome = ?, especialidade = ? WHERE codigo = ?;";

            PreparedStatement ps = c.prepareStatement(query);

            ps.setString(1, nome);
            ps.setString(2, especialidade);
            ps.setString(3, codigo);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public ArrayList<ProfessorModel> listarProfessoresTI () {
        ArrayList<ProfessorModel> professores = new ArrayList<>();
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM professor WHERE especialidade LIKE '%Tecnologia da Informação%';";

            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sigla = rs.getString("codigo");
                String nome = rs.getString("nome");
                String codigoDisciplina = rs.getString("codigo_disciplina");
                String especialidade = rs.getString("especialidade");
                String dataAdmissao = rs.getString("data_admissao");

                ProfessorModel professor = new ProfessorModel(sigla, nome, especialidade, dataAdmissao, codigoDisciplina);
                professores.add(professor);
                return professores;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<ProfessorModel> listarProfessoresMaisNovos () {
        ArrayList<ProfessorModel> professores = new ArrayList<>();
        try (Connection c = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM professor ORDER BY data_admissao DESC;";

            PreparedStatement ps = c.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sigla = rs.getString("codigo");
                String nome = rs.getString("nome");
                String codigoDisciplina = rs.getString("codigo_disciplina");
                String especialidade = rs.getString("especialidade");
                String dataAdmissao = rs.getString("data_admissao");

                ProfessorModel professor = new ProfessorModel(sigla, nome, especialidade, dataAdmissao, codigoDisciplina);
                professores.add(professor);
                return professores;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
