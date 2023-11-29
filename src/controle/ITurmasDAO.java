package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public interface ITurmasDAO {

	public boolean inserir(Turma t);

	public boolean alterar(Turma t);

	public boolean excluir(Turma t);
	
	public boolean inseriraluno(Aluno a);
	
	public boolean excluiraluno(Aluno a);

	public ArrayList<Turma> listarTurmas();

}
