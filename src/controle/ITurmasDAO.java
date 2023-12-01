package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public interface ITurmasDAO {

	public boolean inserir(Turma t);

	public boolean alterar(Turma t,Integer codigo);

	public boolean excluir(Integer codigo);
	
	public boolean inseriraluno(Aluno a,Integer codigo,ArrayList<Aluno> alunos);
	
	public boolean excluiraluno(Aluno a);
	
	public boolean listaraluno(Aluno a,ArrayList<Aluno> alunos);

	public ArrayList<Turma> listarTurmas();

}
