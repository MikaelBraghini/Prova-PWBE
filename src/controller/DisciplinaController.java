package controller;

import dao.DisciplinaDao;
import model.Disciplina;
import view.DisciplinaView;

public class DisciplinaController {

	private DisciplinaDao disciplinaDao;
	private DisciplinaView disciplinaView;

	public DisciplinaController() {
		disciplinaDao = new DisciplinaDao();
		disciplinaView = new DisciplinaView();
	}

	public void adicionaDisciplina(String codigo_disciplina, String nome_disciplina, String ementa) {
		Disciplina disciplina = new Disciplina(codigo_disciplina, nome_disciplina, ementa);
		disciplinaDao.addDisciplinaSQL(disciplina);
	}

	public void removeDisciplina(String codigo) {
		disciplinaDao.removerDisciplina(codigo);
	}

	public void exibirListaDeDisciplina() {
		disciplinaView.listarDisciplina(disciplinaDao.obterListaDisciplina());
	}

}
