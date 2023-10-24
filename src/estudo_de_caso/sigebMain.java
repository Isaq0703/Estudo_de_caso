package estudo_de_caso;

import java.util.ArrayList;
import java.util.Scanner;

public class sigebMain {

	private static ArrayList<Aluno> listaAlunos = new ArrayList<>();
	private static ArrayList<Turma> listaTurmas = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		Integer op = 0;
		Integer opT = 0;
		Integer opT2 = 0;
		Integer i = 0;
		Integer turmae = 0;
		Integer turmax = 0;
		while (op != 4) {
			System.out.println("***SIGEB***\n");
			System.out.println("1 Turmas");
			System.out.println("2 Alunos");
			System.out.println("3 Notas");
			System.out.println("4 Encerrar");
			System.out.println("");
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
					i = 0;
					System.out.println("Criar Turma\n");
					System.out.println("");
					System.out.println("Digite o nome da turma a ser criada:");
					String nome = leitura.nextLine();
					Turma turma1 = new Turma();
					turma1.setNome(nome);
					System.out.println("Digite o código da turma:");
					turma1.setCodTurma(leitura.nextLine());

					listaTurmas.add(turma1);
					System.out.println("Turma '" + turma1.getNome() + "' criada com sucesso");
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
						op = 4;
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
					i = 0;
					// EDITAR
					System.out.println("Editar Turma;");
					System.out.println("");
					System.out.println("Digite o número da turma a ser editada:");
					for (Turma listaT : listaTurmas) {
						i = i + 1;
						System.out.println(i + "-" + listaT.getNome());
					}
					turmae = Integer.valueOf(leitura.nextLine());
					System.out.println("Digite o novo nome da turma:");
					Turma turmaE = new Turma();
					turmaE.setCodTurma(leitura.nextLine());
					turmaE.setNome(leitura.nextLine());
					listaTurmas.set((turmae - 1), turmaE);
					System.out.println("nome alterado com sucesso");
					System.out.println(" ");
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
						op = 4;
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
					i = 0;
					// LISTAR
					System.out.println("Ver Turmas\n");
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getNome());
					}
					System.out.println("1 Voltar ao menu");
					System.out.println("2 Encerrar programa");
					System.out.println("");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 4;
						break;
					}
					}
					break;
				}
				case 4: {
					// EXCLUIR
					i = 0;
					System.out.println("Excluir turma\n");
					System.out.println("");
					System.out.println("Digite o número da turma a ser excluída:");
					for (Turma listaT : listaTurmas) {
						i = i + 1;
						System.out.println(i + "-" + listaT.getNome());
					}
					turmax = Integer.valueOf(leitura.nextLine());
					listaTurmas.remove((turmax - 1));
					System.out.println("turma excluída com sucesso");
					System.out.println("1 Voltar ao menu");
					System.out.println("2 Encerrar programa");
					System.out.println("3 Excluir outra turma");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch (opT2) {
					case 1: {
						op = 0;
						break;
					}
					case 2: {
						System.out.println("Encerrando...");
						op = 4;
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
					System.out.println("Digite Novamente;");
					System.out.println("");
				}
				}
				break;
			}
			case 2: {
				// ALUNOS
				System.out.println("Alunos\n");
				System.out.println("1 Adicionar Aluno");
				System.out.println("2 Editar Aluno");
				System.out.println("3 Listar Alunos");
				System.out.println("4 Excluir Aluno\n");
				opT = Integer.valueOf(leitura.nextLine());
				switch (opT) {
				case 1: {
					// ADICIONAR
					System.out.println("Adicionar Aluno\n");

					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma em que você deseja adicionar um aluno:");
					String turmaA = leitura.nextLine();

					for (Turma listaT : listaTurmas) {
						if (listaT.getCodTurma().equals(turmaA)) {
							System.out.println("Digite o nome do aluno que será adicionado:");
							Aluno alunoA = new Aluno();
							alunoA.setNome(leitura.nextLine());
							System.out.println("Digite o cóigo do aluno que será adicionado:");
							alunoA.setCodigoMatricula(leitura.nextLine());
							listaAlunos.add(alunoA);
							listaT.setAlunos(listaAlunos);
						}
					}
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
						op = 4;
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
					System.out.println("Editar Aluno\n");
					
					break;
				}
				case 3: {
					// LISTAR
					System.out.println("Listar alunos\n");
					for (Aluno aluno : listaAlunos) {
						System.out.println(aluno.getNome());
					}
					System.out.println("\n");
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
						op = 4;
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
				case 4: {
					// EXCLUIR
					System.out.println("Excluir alunos\n");
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma onde o aluno está cadastrado:");
					String turmaA = leitura.nextLine();
					System.out.println("\n");
					for (Turma listaT : listaTurmas) {
						if (listaT.getCodTurma().equals(turmaA)) {
							for (Aluno aluno : listaT.getAlunos()) {
								System.out.println(aluno.getCodigoMatricula() + "-" + aluno.getNome());
							}
							System.out.println("Digite o código do aluno que deseja excluir:");
							String codMatricula = leitura.nextLine();

							for (Aluno aluno : listaT.getAlunos()) {
								if (aluno.getCodigoMatricula().equals(codMatricula)) {
									listaT.getAlunos().remove(aluno);
									System.out.println("Aluno removido com sucesso");
									return;
								}
							}
						}
					}
				}
					break;
				}
				break;
			}
			case 3: {
				// NOTAS
				System.out.println("Notas");
				System.out.println("1 Registrar Notas");
				System.out.println("2 Editar Notas");
				System.out.println("3 Listar Notas");
				System.out.println("4 Excluir Notas");
				opT = Integer.valueOf(leitura.nextLine());
				switch (opT) {
				case 1:
					for (Turma listaT : listaTurmas) {
						System.out.println(listaT.getCodTurma() + "-" + listaT.getNome());
					}
					System.out.println("Digite o código da turma em que você deseja regitrar uma nota");
					String turmaA = leitura.nextLine();
					System.out.println("Digite o número do aluno que terá a nota registrada:\n");

					break;
				case 2:

					break;

				case 3:

					break;
				case 4:

					break;
				}
				break;
			}
			case 4: {
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