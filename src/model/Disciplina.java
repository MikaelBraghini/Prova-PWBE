package model;

public class Disciplina {

	private String codigo_disciplina;
	private String nome_disciplina;
	private String ementa;
	
	public Disciplina(String codigo_disciplina,String nome_disciplina,String ementa) {
		this.codigo_disciplina = codigo_disciplina;
		this.nome_disciplina = nome_disciplina;
		this.ementa = ementa;
	}

	public String getCodigo_disciplina() {
		return codigo_disciplina;
	}

	public void setCodigo_disciplina(String codigo_disciplina) {
		this.codigo_disciplina = codigo_disciplina;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	
}
