package controle;

import java.util.ArrayList;

public interface IAlunoDAO {
	
	public boolean inserir(AlunoDAO a);

	public boolean alterar(AlunoDAO a);

	public boolean excluir(AlunoDAO a);

	public ArrayList<AlunoDAO> listaAluno();
}
