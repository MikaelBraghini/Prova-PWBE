package view;

import java.util.ArrayList;

import model.Disciplina;

public class DisciplinaView {

	public void menuDiciplina() {
		System.out.println(".______________________________________");
		System.out.println("| 8- Cadastrar disciplina");
		System.out.println("| 9- Remover disciplina");
		System.out.println("| 10- Exibir disciplina");
		System.out.println("| 11- Listar todas disciplinas");
		System.out.println("| 12- Atualizar nome disciplina e ementa");
		System.out.println("|______________________________________");
	}

	public void codigoDisciplina(){
		System.out.println("Digite o codigo da Disciplina: ");
	}
	public void nomeDisciplina(){
		System.out.println("Digite o nome do Disciplina:  ");
	}
	public void ementaDisciplina(){
		System.out.println("Digite a ementa da Disciplina ");

	}
	
	public void listarDisciplina(ArrayList<Disciplina> list) {
		for(Disciplina d: list) {
			System.out.println(d.getCodigo_disciplina());
			System.out.println(d.getNome_disciplina());
			System.out.println(d.getEmenta());
		}
	}
}
