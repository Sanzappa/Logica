//Fa�a um programa que leia dois valores, 
//divida o primeiro valor digitado pelo segundo valor digitado e informe para o usu�rio qual ser� o valor de resto dessa divis�o
package folha1;

import java.util.Scanner;

public class Ex8 {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);	
		
		System.out.println("Digite um valor: ");
		double vl1 = entrada.nextDouble();
		
		System.out.println("Digite outro valor ");
		double vl2 = entrada.nextDouble();
		
		double resto  = vl1%vl2;
		
		System.out.printf("O resto da divis�o � igual a %.2f", resto);
		
	}

}
