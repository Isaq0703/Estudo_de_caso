package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public class TurmaDAO implements ITurmasDAO {
	private static ArrayList<Turma> tabelaturmas;
	private static ArrayList<Aluno> tabelaAluno;
	
	public static TurmaDAO instancia;

	public static TurmaDAO getInstancia() {
		if (instancia == null) {
			instancia = new TurmaDAO();
			tabelaturmas = new ArrayList<>();
			tabelaAluno = new ArrayList<>();
		}
		return instancia;
	}

	@Override
	public boolean inserir(Turma t) {
		if(t != null) {
			tabelaturmas.add(t);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Turma t, String codigo) {
		for (Turma turminha : tabelaturmas) {
			if(turminha.getCodTurma().equals(codigo)) {
				turminha.setNome(t.getNome());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(String codigo) {
		for (Turma turminha : tabelaturmas) {
			if(codigo.equals(turminha.getCodTurma())) {
				tabelaturmas.remove(turminha);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Turma> listarTurmas() {
		return tabelaturmas;
	}
	public ArrayList<Aluno> ListarAlunos(){
		return tabelaAluno;
	}
	
	public boolean inseriraluno(Aluno a,String codigo){
		for (Turma turminha : tabelaturmas) {
			if(codigo.equals(turminha.getCodTurma())) {
				tabelaAluno.add(a);
				return true;
			}
		}
		return false;
	}
	public boolean listaraluno(Aluno a,ArrayList<Aluno> alunos) {
		for (Turma turminha : tabelaturmas) {
			for (Aluno aluno : alunos) {
				System.out.println(aluno.getNome());
			}
		}
		return false;
	}
	public boolean excluiraluno(Aluno a) {
		boolean excluia = tabelaAluno.remove(a);
		return excluia;
	}

}
