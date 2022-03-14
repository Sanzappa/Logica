package vetor;
import java.util.Arrays;
import java.util.Scanner;
public class Vetor {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int menu = 0;
		
		while ( menu <= 8) {
			System.out.println("1- EX 1\n2- EX 2\n3- EX 3\n4- EX 4\n5- EX 5\n6- EX 6\n7- EX 7\n8- Sair ");
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
					int[] num5 = new int[20];
					int[] num6 = new int[20];
					int[] num7 = new int[20];
					int[] num8 = new int[20];
					int[] num9 = new int[20];
					for (int i = 0; i < num5.length; i++) {
						System.out.println("Digite um numero");
						num5[i] = entrada.nextInt();
					}
					for (int i = 0; i < num6.length; i++) {
						System.out.println("Digite um numero");
						num6[i] = entrada.nextInt();
					}
					System.out.println("Vetor de subtra��o");
					for (int i = 0; i < num7.length; i++) {
						num7[i] = num6[i] - num5[i];
						System.out.print(num7[i]+ " ");
					}
					System.out.println("\nVetor de soma");
					for (int i = 0; i < num8.length; i++) {
						num8[i] = num6[i] + num5[i];
						System.out.print(num8[i]+ " ");
					}
					System.out.println("\nVetor de multiplica��o");
					for (int i = 0; i < num9.length; i++) {
						num9[i] = num6[i] * num5[i];
						System.out.print(num9[i]+ " ");
					}
					System.out.println();
					break;
				case 6:
					int quantIMP = 0, quantPAR = 0;
					
					System.out.println("Digite quantos numeros deseja comparar: ");
					int qtd = entrada.nextInt();
					int[] valor = new int[qtd];
					
					for (int i = 0; i < valor.length; i++) {
						System.out.println("Digite os numeros: ");
						valor[i] = entrada.nextInt();
						
						if (valor[i] % 2 == 0) {
							quantPAR++;
						}else {
							quantIMP++;
						}	
					}
					int[] par = new int[quantPAR];
					int[] impar = new int[quantIMP];
					
					for (int i = 0; i < par.length; i++) {
						par[i] = 1;
					}
					
					for (int i = 0; i < impar.length; i++) {
						impar[i] = 0;
					}
					
					for (int i = 0; i < valor.length; i++) {
						if (valor[i] % 2 ==0) {
							for (int j = 0; j < par.length; j++) {
								if (par[j] == 1) {
									par[j] = valor[i];
									break;
								}
							}
						}else {
							for (int j = 0; j < impar.length; j++) {
								if (impar[j] == 0) {
									impar[j] = valor[i];
									break;
								}
							}
						}
					}
					
					Arrays.sort(par);
					Arrays.sort(impar);
					
					System.out.println("Pares");
					
					for (int i = 0; i < par.length; i++) {
						System.out.print(par[i] + " ");
					}
					
					System.out.println("\nImpares");
					
					for (int i = impar.length - 1; i >= 0; i--) {
						System.out.print(impar[i] + " ");
					}
					
					
					System.out.println(" ");
					
					break;
				case 7:
					System.out.println("Digite quantos numeros deseja comparar: ");
					int n = entrada.nextInt();
					int[] v = new int[n];
					int[] v2 = new int[n];
					
					for (int i = 0; i < n/2; i++) {
						System.out.println("Digite um numero: ");
						v[i] = entrada.nextInt();
					}
					for (int i = 0; i < n/2; i++) {
						System.out.println("Digite o numero a ser comparado: ");
						v2[i] = entrada.nextInt();
						
					}
					boolean comp = false;
						for (int i = 0; i < n	; i++) {
						if (v[i] == v2[i]) {
							comp = true;
						}else {
							comp = false;
							break;
						}
						}
						if (comp) {
							System.out.println("S�o iguais.");
						} else {
							System.out.println("Nao sao iguais.");
						}
					break;
					default:
						System.out.println("Adeus");
						break;
			}
		}
	}
}