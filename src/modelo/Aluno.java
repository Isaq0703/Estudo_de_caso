package modelo;

//import controle.TurmaDAO;

public class Aluno extends Turma {

	private Integer codigoMatricula;
	private String nome;

	public Integer getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(Integer codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
