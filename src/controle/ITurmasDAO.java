package controle;

import java.util.ArrayList;

import modelo.Aluno;
import modelo.Turma;

public interface ITurmasDAO {

	public boolean inserir(Turma t);

	public boolean alterar(Turma t,String codigo);

	public boolean excluir(String codigo);
	
	public boolean inseriraluno(ArrayList<Aluno>alunos,String codigo);
	
	public boolean excluiraluno(String codigo, Integer matricula,ArrayList<Aluno> alunos);
	
	public ArrayList<Aluno> listarAlunos(String codigo);

	public ArrayList<Turma> listarTurmas();

}
