package controller;

import view.DisciplinaView;
import view.ProfessorView;

import java.util.Scanner;

public class Menu {
    private ProfessorController professorController;
    private DisciplinaController disciplinaController;
    private ProfessorView professorView;
    private DisciplinaView disciplinaView;

    public Menu() {
        disciplinaController = new DisciplinaController();
        professorController = new ProfessorController();
        professorView = new ProfessorView();
        disciplinaView = new DisciplinaView();
        Scanner input = new Scanner(System.in);
        int check;

        while (true) {
            /*menu Professor*/
            professorView.menuProfessor();
            disciplinaView.menuDiciplina();
            check = input.nextInt();
            input.nextLine();
            if (check == 0) {
                input.close();
                break;
            }
            switch (check) {
                case 1 -> {
                    professorView.codigoProfessor();
                    String codigo = input.nextLine();
                    professorView.nomeProfessor();
                    String nome = input.nextLine();
                    professorView.especialidadeProfessor();
                    String especialidade = input.nextLine();
                    professorView.dataAdmissaoProfessor();
                    String dataAdmissao = input.nextLine();
                    professorView.disciplinaProfessor();
                    String disciplina = input.nextLine();

                    professorController.addProfessor(codigo, nome, especialidade, dataAdmissao, disciplina);
                }

                case 2 -> {
                    professorController.listarProfessores();
                }

                case 3 -> {
                    professorView.codigoProfessor();
                    String codigo = input.nextLine();
                    professorController.listarProfessor(codigo);
                }

                case 4 -> {
                    professorView.codigoProfessor();
                    String codigo = input.nextLine();
                    professorController.deleteProfessor(codigo);
                }

                case 5 -> {
                    professorView.codigoProfessor();
                    String codigo = input.nextLine();
                    professorView.nomeProfessor();
                    String nome = input.nextLine();
                    professorView.especialidadeProfessor();
                    String especialidade = input.nextLine();
                    professorController.updateProfessor(codigo, nome, especialidade);
                }

                case 7 -> {
                    //paramos aqui
                }
                case 8 -> {





                    disciplinaController.adicionaDisciplina();
                }
                case 9 ->{

                }
                case 10 ->{

                }

            }
        }
    }
}
