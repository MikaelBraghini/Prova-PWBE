package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Disciplina;

public class DisciplinaDao {

	private String url = "jdbc:mysql://localhost:3306/senai_banco_academico";
	private String usuario = "root";
	private String senha = "aluno";
	private ArrayList<Disciplina> listaDeDisciplina;

	public DisciplinaDao() {
		listaDeDisciplina = new ArrayList<>();
	}

	public void addDisciplinaSQL(Disciplina disciplina) {
		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "INSERT INTO disciplina (sigla, nome, ementa) VALUES (?,?,?);";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, disciplina.getCodigo_disciplina());
			ps.setString(2, disciplina.getNome_disciplina());
			ps.setString(3, disciplina.getEmenta());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removerDisciplina(String codigo) {
		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "DELETE FROM disciplina WHERE sigla = ?;";

			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, codigo);

			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Disciplina> obterListaDisciplina() {
		try(Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "Select * From disciplina;";
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				String codigo_disciplina = resultSet.getString("sigla");
				String nome_disciplina = resultSet.getString("nome");
				String ementa = resultSet.getString("ementa");
				Disciplina disciplina = new Disciplina(codigo_disciplina, nome_disciplina, ementa);
				listaDeDisciplina.add(disciplina);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaDeDisciplina;
	}
	
	public void updateDisciplina(String ementa, String sigla) {
		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "UPDATE disciplina SET emente = ? WHERE sigla = ?;";

			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, ementa);
			ps.setString(2, sigla);

			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void listarDisciplina(String codigo) {
		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT * FROM disciplina WHERE sigla = ?;";
			
			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, codigo);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}