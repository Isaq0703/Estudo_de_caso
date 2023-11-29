package modelo;

//import controle.TurmaDAO;

public class Aluno extends Turma {

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
}
