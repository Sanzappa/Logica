//Desenvolva um programa que leia tr�s vari�veis (a, b, c) que representam os lados de um tri-�ngulo e retorne o tipo de tri�ngulo, 
//se todos os lados s�o iguais o tri�ngulo � equil�tero,
//se todos os lados forem diferentes o tri�ngulo � escaleno, e se apenas dois lados forem iguais e um diferen-te o triangulo � is�sceles
package folha1;

import java.util.Scanner;

public class Ex11 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do triangulo: ");
		double a = entrada.nextDouble();
		
		System.out.println("Digite o valor do segundo lado do triangulo: ");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor do terceiro lado do triangulo: ");
		double c = entrada.nextDouble();
		
		if (a == b && a == c) {
			System.out.println("O triangulo � Equil�tero");
		}else if (a == b|| a == c|| b == c) {
			System.out.println("Neste caso o triangulo � Is�sceles");
		}else {
			System.out.println("O triangulo � Escaleno");
			
			
		}
	}

}
