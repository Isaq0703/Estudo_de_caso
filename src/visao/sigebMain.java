package visao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import controle.TurmaDAO;
import modelo.Aluno;
import modelo.Turma;

public class sigebMain {

	private static TurmaDAO daoTurma = TurmaDAO.getInstancia();

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		Integer op = 0;
		Integer opT = 0;
		Integer opT2 = 0;
		while (op != 3) {
			System.out.println("***SIGEB***\n");
			System.out.println("1 Turmas");
			System.out.println("2 Alunos");
			System.out.println("3 Encerrar");
			System.out.println("");
			System.out.println("Digite o número da opção selecionada:");
			op = Integer.valueOf(leitura.nextLine());
			switch (op) {
			case 1: {
				// TURMAS
				System.out.println("Turmas\n");
				System.out.println("1 Criar Turma");
				System.out.println("2 Editar Turma");
				System.out.println("3 Ver Turmas");
				System.out.println("4 Excluir Turma");
				System.out.println("");
				opT = Integer.valueOf(leitura.nextLine());
				switch (opT) {
				case 1: {
					// CRIAR
					System.out.println("Criar Turma\n");
					System.out.println("");
					System.out.println("Digite o nome da turma a ser criada:");
					String nome = leitura.nextLine();
					System.out.println("Digite o código da turma:");
					String codigo = leitura.nextLine();
					Turma turma1 = new Turma();
					turma1.setNome(nome);
					turma1.setCodTurma(codigo);
					turma1.setAlunos(null);
					TurmaDAO dao = new TurmaDAO();
					dao.inserir(turma1);

					System.out.println("\nTurma '" + turma1.getNome() + "' criada com sucesso\n");
					System.out.println("\n");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					default: {
						System.out.println("Digite novamente;");
						op = 1;
						break;
					}
					}
					break;
				}
				case 2: {
					// EDITAR
					System.out.println("Editar Turma;");
					System.out.println("");

					ArrayList<Turma> listaTurmas = daoTurma.listarTurmas();

					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + " -" + listaT.getNome());
					}
					System.out.println("\nDigite o código da turma a ser editada:");
					String cod = leitura.nextLine();
					Turma n = new Turma();
					System.out.println("\n");
					System.out.println("Digite o novo nome da turma:");
					n.setNome(leitura.nextLine());
					TurmaDAO dao1 = new TurmaDAO();
					dao1.alterar(n, cod); // obj da turma ja com os novos valores
					System.out.println("\nnome alterado com sucesso");
					System.out.println("\n");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					default: {
						System.out.println("Digite novamente;");
						break;
					}
					}
					break;
				}
				case 3: {
					// LISTAR
					System.out.println("Ver Turmas\n");
					ArrayList<Turma> listaTurmas = daoTurma.listarTurmas();
					for (Turma listaT : listaTurmas) {
						System.out.println("Nome: " + listaT.getNome() + ", Código: " + listaT.getCodTurma());
					}
					System.out.println("\n");
					System.out.println("1 Voltar ao menu");
					System.out.println("2 Encerrar programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					}
					break;
				}
				case 4: {
					// EXCLUIR
					System.out.println("Excluir turma\n");
					System.out.println("");
					ArrayList<Turma> listaTurmas = daoTurma.listarTurmas();
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma a ser excluída:");
					String cod = leitura.nextLine();
					daoTurma.excluir(cod);
					System.out.println("\nturma excluída com sucesso\n");
					System.out.println("\n");
					System.out.println("1 Voltar ao menu");
					System.out.println("2 Encerrar programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					case 3: {
						op = 0;
						opT = 4;
						break;
					}
					}
					break;
				}
				default: {
					System.out.println("Digite Novamente;\n");
					System.out.println("");
				}
				}
				break;
			}
			case 2: {
				// ALUNOS
				System.out.println("Alunos\n");
				System.out.println("1 Adicionar Aluno");
				System.out.println("2 Listar Alunos");
				System.out.println("3 Excluir Aluno\n");
				opT = Integer.valueOf(leitura.nextLine());
				switch (opT) {
				case 1: {
					// ADICIONAR
					System.out.println("Adicionar Aluno\n");

					ArrayList<Turma> listaTurmas = daoTurma.listarTurmas();
					ArrayList<Aluno> alunos = new ArrayList<Aluno>();
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma em que você deseja adicionar um aluno:");
					String cod = leitura.nextLine();
					for (Turma listaT : listaTurmas) {
						if (listaT.getCodTurma().equals(cod) && (listaT.getAlunos() != null)) {
							alunos = listaT.getAlunos();
						}
					}
					Aluno aluno = new Aluno();
					System.out.println("Digite o nome do aluno que será adicionado:");
					aluno.setNome(leitura.nextLine());
					System.out.println("Digite o número de matricula do aluno que será adicionado:");
					aluno.setCodigoMatricula(Integer.valueOf(leitura.nextLine()));
					TurmaDAO dao = new TurmaDAO();
					alunos.add(aluno);
					dao.inseriraluno(alunos, cod);
					// DAO (inseriraluno)
					System.out.println("Aluno adicionado com sucesso\n");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					default: {
						System.out.println("Digite novamente;");
						op = 1;
						break;
					}
					}
					break;
				}
				case 2: {
					// LISTAR
					System.out.println("Listar alunos\n");
					ArrayList<Turma> listaTurmas = daoTurma.listarTurmas();
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma:");
					String cod = leitura.nextLine();
					ArrayList<Aluno> listaAlunos = daoTurma.listarAlunos(cod);
					if (listaAlunos == null) {
						System.out.println("Não há alunos cadastrados nessa turma");
					} else {
						for (Aluno aluno : listaAlunos) {
							System.out
									.println("Nome: " + aluno.getNome() + ", Matricula: " + aluno.getCodigoMatricula());
						}
					}
					System.out.println("\n");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					default: {
						System.out.println("Digite novamente;");
						op = 1;
						break;
					}
					}
					break;
				}
				case 3: {
					// EXCLUIR
					ArrayList<Aluno> lista = new ArrayList<Aluno>();
					System.out.println("Excluir alunos\n");

					for (Turma listaT : daoTurma.listarTurmas()) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma onde o aluno está cadastrado:");
					String cod = leitura.nextLine();
					System.out.println("\n");
					for (Turma turma : daoTurma.listarTurmas()) {
						if (turma.getCodTurma().equals(cod)) {
							lista = turma.getAlunos();
							for (Aluno aluno : turma.getAlunos()) {
								System.out.println(aluno.getCodigoMatricula() + "-" + aluno.getNome());
							}
							System.out.println("Digite a matricula do aluno que deseja excluir:");
							Integer matricula = Integer.valueOf(leitura.nextLine());
							TurmaDAO dao = new TurmaDAO();
							dao.excluiraluno(cod, matricula, lista);
							for (Turma listaT : daoTurma.listarTurmas()) {
								if (listaT.getCodTurma().equals(cod)) {
									listaT.setAlunos(lista);
								}

							}
							// turma.getAlunos().remove(aluno);
						}
					}

					System.out.println("Aluno removido com sucesso");

					System.out.println("\n");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("\n");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 3;
						break;
					}
					default: {

						System.out.println("Digite novamente;");
						op = 1;
						break;
					}
					}
					break;
				}
				}
				break;
			}
			case 3: {
				// ENCERRAR
				System.out.println("Encerrando...");
				break;
			}
			default: {
				System.out.println("Digite novamente;");
				System.out.println("");
			}
			}
		}
	}
}