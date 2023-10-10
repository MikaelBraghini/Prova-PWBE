package view;

import model.ProfessorModel;

import java.util.ArrayList;

public class ProfessorView {

    public void listarProfessoresView(ArrayList<ProfessorModel> professores) {
        for(ProfessorModel p : professores) {
            System.out.println(p);
        }
    }

    public void listarProfessorView(ProfessorModel professor) {
        System.out.println(professor);
    }

    public void menuProfessor(){
        System.out.println(".____________________________________________________________________________");
        System.out.println("| 1- Cadastrar professor");
        System.out.println("| 2- Listar todos professores");
        System.out.println("| 3- Exibir professor");
        System.out.println("| 4- Remover professor");
        System.out.println("| 5- Atualizar nome professores e ementa");
        System.out.println("| 6- Exibir todos os professores com especialidade em TI");
        System.out.println("| 7- Exibir todos os professores ordenados por data de admissão mais recente.");
        System.out.println("|____________________________________________________________________________");

    }
    public void codigoProfessor(){
        System.out.println("Digite o codigo do Professor: ");
    }
    public void nomeProfessor(){
        System.out.println("Digite o nome do Professor: ");
    }
    public void especialidadeProfessor(){
        System.out.println("Digite a especialidade do Professor: ");

    }
    public void dataAdmissaoProfessor(){

        System.out.println("Digite a data admissao do Professor: ");
    }
    public void disciplinaProfessor(){

        System.out.println("Digite a disciplina do Professor: ");
    }
}
