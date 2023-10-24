package estudo_de_caso;

import java.util.ArrayList;

public class Aluno {

	private String codigoMatricula;
	private String nome;

	public String getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public ArrayList<String> getNotas() {
		return Notas;
	}

	public void setNotas(ArrayList<String> notas) {
		Notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> Notas = new ArrayList<>();
}
