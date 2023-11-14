package controle;

import java.util.ArrayList;

import modelo.Turma;

public class TurmaDAO implements ITurmasDAO {
	private static ArrayList<Turma> tabelaturmas;
	public static TurmaDAO instancia;

	public static TurmaDAO getInstancia() {
		if (instancia == null) {
			instancia = new TurmaDAO();
			tabelaturmas = new ArrayList<>();
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
	public ArrayList<Turma> listarTurma() {
		return tabelaturmas;
	}


}
