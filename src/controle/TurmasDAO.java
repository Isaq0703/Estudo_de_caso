package controle;

import java.util.ArrayList;

import modelo.Turma;

public class TurmasDAO implements ITurmasDAO {
	private ArrayList<Turma> tabelaturmas;
	public static TurmasDAO instancia;

	public static TurmasDAO getInstancia() {
		if (instancia == null) {
			instancia = new TurmasDAO();
		}
		return instancia;
	}

	public static void setInstancia(TurmasDAO instancia) {
		TurmasDAO.instancia = instancia;
	}

	@Override
	public boolean inserir(Turma t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alterar(Turma t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluir(Turma t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Turma> listarTurma() {
		// TODO Auto-generated method stub
		return null;
	}

}
