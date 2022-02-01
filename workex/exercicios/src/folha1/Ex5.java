 //Um caminh�o consegue transportar 18 toneladas de laranjas em uma viagem que faz entre a fazenda
//e a f�brica de suco de laranja. Um alqueire de terra produz em m�dia 250 toneladas de laranjas.
//Fa�a um programa que leia quantos caminh�es e quantos alqueires uma fazenda pro-dutora de laranjas possui,
//calcule e apresente na tela quantas viagens de caminh�o ser�o necess�rias para transportar toda a colheita de laranjas
package folha1;

import java.util.Scanner;

public class Ex5 {

	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de caminh�es: ");
		int cam = entrada.nextInt();
		
		System.out.println("Digite a quantidade de alqueires");
		int alq = entrada.nextInt();
		
		int viagens = (int) Math.ceil(((250*alq)/18)/cam);
		
		System.out.println("Ser�o necess�rias " + viagens + " viagens");
		
		
		

	}

}
