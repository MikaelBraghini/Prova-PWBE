package controller;

import dao.ProfessorDAO;
import model.ProfessorModel;
import view.ProfessorView;

public class ProfessorController {
    private ProfessorDAO professorDAO;
    private ProfessorView professorView;

    public ProfessorController() {
        professorDAO = new ProfessorDAO();
        professorView = new ProfessorView();
    }

    public void addProfessor(String codigo, String nome, String especialidade, String dataAdimissao, String siglaDisciplina) {
        ProfessorModel professor = new ProfessorModel(codigo, nome, especialidade, dataAdimissao);
        professorDAO.addProfessorSQL(professor, siglaDisciplina);
    }

    public void listarProfessores() {
        professorView.listarProfessoresView(professorDAO.listarProfessoresSQL());
    }

    public void listarProfessor(String codigo) {
        professorView.listarProfessorView(professorDAO.listarProfessorSQL(codigo));
    }

    public void deleteProfessor(String codigo) {
        professorDAO.deleteProfessorSQL(codigo);
    }

    public void updateProfessor(String codigo, String nome, String especialidade) {
        professorDAO.atualizarProfessorSQL(codigo, nome, especialidade);
    }
}
