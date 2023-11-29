package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public interface ITurmasDAO {

	public boolean inserir(Turma t);

	public boolean alterar(Turma t);

	public boolean excluir(Turma t);
	
	public boolean inseriraluno(Turma t);
	
	public boolean excluiraluno(Turma t);

	public ArrayList<Turma> listarTurmas();

}
