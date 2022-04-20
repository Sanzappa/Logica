package Main;

import java.util.Scanner;

public class Main {

	private static Scanner s = new Scanner(System.in);
	public static void Main(String[] args) {
		
		int menu = 0;
		
		do {
			System.out.println("Digite uma opção: ");
			System.out.println("1- Cadastre um aluno\t2 - listar alunos");
			 menu = s.nextInt();
			
			 switch (menu) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				listarAlunos();
				break;
				
			default:
				break;
			}
		}while(menu != 0);
		
	}
	private static void cadastrarAluno() {
		
	}
	private static void listarAlunos() {
		
	}
}