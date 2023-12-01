package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public interface ITurmasDAO {

	public boolean inserir(Turma t);

	public boolean alterar(Turma t,String codigo);

	public boolean excluir(String codigo);
	
	public boolean inseriraluno(Aluno a,String codigo);
	
	public boolean excluiraluno(Aluno a);
	
	public boolean listaraluno(Aluno a,ArrayList<Aluno> alunos);

	public ArrayList<Turma> listarTurmas();

}
