package vetor;
import java.util.Scanner;
public class Vetor {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menu = 0;
		
		while ( menu <= 8) {
			System.out.println("1- EX 1\n2- EX 2\n3- EX 3\n4- EX 4\n5- EX 5");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:
				int[] num = new int[10];
				for (int i = 0; i < 10; i++) {
					
					System.out.println("Digite um numero: ");
					num[i] = entrada.nextInt();
				}
				for (int i = 0; i < 10; i++) {
					System.out.println(num[i]);
				}
				for (int i = 9; i >= 0; i--) {
					System.out.println(num[i]);
				}
				break;
				
				case 2:
					int[] num1 = new int[10];
					for (int i = 0; i < num1.length; i++) {
						
						System.out.println("Digite um numero 10 vezes: ");
						num1[i] = entrada.nextInt();
					}
					for (int i = 0; i < num1.length; i++) {
						System.out.println(num1[i]);
					}
					int[] num2 = new int[10];
						for (int i = 9; i >= 0; i--) {
							num2[9-i] = num1[i];
							
						}
						for (int i = 0; i < num2.length; i++) {
						System.out.println(num2[i]);	
						}
					break;	
				case 3:
					int[] num3 = new int [10];
					double[] num4 = new double [10]; 
					for (int i = 0; i < num3.length; i++) {
						do {
								System.out.println("Digite um numero inteiro e positivo: ");                         
								num3[i] = entrada.nextInt();
								if (num3[i] <= 0) {
									System.out.println("Numero negativo(NEGADO)");
								}
						}while(num3[i] <= 0);
							
						}
					for (int i = 0; i < num4.length; i++) {
						if (i % 2 == 0) {
							num4[i] = (double) num3[i] / 2;
						
						}else {
							num4[i] = (double) num3[i] * 3;
						}
					}
					System.out.println("\nVetor 1:");
					
					for (int i = 0; i < num3.length; i++) {
						System.out.print(num3[i] + " ");
						
					}
					System.out.println("\nVetor 2:");
					
					for (int i = 0; i < num4.length; i++) {
						System.out.print(num4[i] + " ");
					}
						
					break;
				case 4:
					String[] c = new String[10];
					for (int i = 0; i < c.length; i++) {
						System.out.println("Digite um nome: ");
						c[i] = entrada.next();
						
					}
					System.out.println("Digite o nome a ser buscado: ");
					String nome = entrada.next();
					boolean achou = false;
					for (int i = 0; i < c.length; i++) {
						if (c[i].equals(nome)) {
							achou = true;
						}
					}
					
					if (achou) {
						System.out.println("ACHEI!");
					} else {
						System.out.println("N�o achei");
					}
					
					break;
				case 5:
					
					break;
			}	
		}
	}
}