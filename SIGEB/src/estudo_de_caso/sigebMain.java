package estudo_de_caso;

import java.util.Scanner;

public class sigebMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		Integer op = 0;
		Integer opT = 0;
		Integer opT2 = 0;
		while(op!=4) {
			System.out.println("***SIGEB***");
			System.out.println("1 Turmas");
			System.out.println("2 Alunos");
			System.out.println("3 Notas");
			System.out.println("4 Encerrar");
			System.out.println("");
			op = Integer.valueOf(leitura.nextLine());
			switch (op) {
			case 1:{
				//turmas
				System.out.println("Turmas;");
				System.out.println("");
				System.out.println("1 Criar Turma");
				System.out.println("2 Editar Turma");
				System.out.println("3 Ver Turmas");
				System.out.println("4 Excluir Turma");
				System.out.println("");
				opT = Integer.valueOf(leitura.nextLine());
				switch(opT){
				case 1:{
					//criar
					System.out.println("Criar Turma;");
					System.out.println("");
					System.out.println("1 Voltar ao Menu");
					System.out.println("2 Encerrar Programa");
					System.out.println("");
					opT2 = Integer.valueOf(leitura.nextLine());
					switch(opT2) {
					case 1:{
						op = 0;
						break;
					}
					case 2:{
						System.out.println("Encerrando...");
						op = 4;
						break;
					}
					}
					break;
				}
				case 2:{
					//editar
					System.out.println("Editar Turma;");
					System.out.println("");
					break;
				}
				case 3:{
					//listar
					System.out.println("Ver Turmas;");
					System.out.println("");
					break;
				}
				case 4:{
					//excluir
					System.out.println("Excluir turma;");
					System.out.println("");
					break;
				}
				default :{
					System.out.println("Digite Novamente;");
					System.out.println("");
				}
				}
				break;
			}
			case 2:{
				//alunos
				System.out.println("Alunos;");
				System.out.println("");
				break;
			}
			case 3:{
				//notas
				System.out.println("Notas;");
				System.out.println("");
				break;
			}
			case 4:{
				//encerrar
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
