package modelo;

import java.util.ArrayList;

//import controle.TurmaDAO;

public class Aluno {
	private static ArrayList<Aluno> tabelaalunos;
	public static Aluno instancia;
	

	public static Aluno getInstancia() {
		if (instancia == null) {
			instancia = new Aluno();
			tabelaalunos = new ArrayList<>();
		}
		return instancia;
	}

	private String codigoMatricula;
	private String nome;

	public String getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean inserir(Aluno a) {
		boolean inseriu = tabelaalunos.add(a);
		return inseriu;
	}
	
	public boolean excluir(Aluno a){
		boolean excluido = tabelaalunos.remove(a);
		return excluido;
	}
}
