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
		boolean inseriu = tabelaturmas.add(t);
		return inseriu;
	}

	@Override
	public boolean alterar(Turma t) {
		boolean alterado = tabelaturmas.add(t);
		return alterado;
	}

	@Override
	public boolean excluir(Turma t) {
		boolean excluido = tabelaturmas.remove(t);

		return excluido;
	}

	@Override
	public ArrayList<Turma> listarTurmas() {
		return tabelaturmas;
	}
	public ArrayList<Aluno> ListarAlunos(){
		return tabelaAluno;
	}
	
	public boolean inseriraluno(Aluno a){
		boolean inseria = tabelaAluno.add(a);
		return inseria;
	}
	public boolean excluiraluno(Aluno a) {
		boolean excluia = tabelaAluno.remove(a);
		return excluia;
	}

}
