 //Sabendo-se que a velocidade de cruzeiro de um avi�o 747-300 � de 900 km/h, fa�a um pro-grama que leia uma dist�ncia (km), calcule e apresente na tela, quanto tempo (horas) ser� ne-cess�rio para um 747-300 sobrevoar a dist�ncia informada
package folha1;

import java.util.Scanner;

public class Ex4 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Digite a dist�ncia: ");
		double dist = entrada.nextDouble();
		
		double tempo = dist / 900;
		
		System.out.println("O avi�o levar� " + tempo + " hora(s) para sobrevoar " + dist + " Km ");

	}

}
