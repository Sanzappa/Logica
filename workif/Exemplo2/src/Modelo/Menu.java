package Modelo;

import java.util.Scanner;

public class Menu {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		System.out.println("Escolha uma op��o: ");
		System.out.println("1.Engatinhar");
		System.out.println("2.Andar");
		System.out.println("3.Correr");
		System.out.println("4.Pedalar");
		System.out.println("5.Dirigir");
		System.out.println("6.Pilotar");
		
		int menu = entrada.nextInt();
		
		switch(menu) {
		case 1: System.out.println("Vem nenem");
		case 2: System.out.println("Anda nenem");
		case 3: System.out.println("Vai cair");
		case 4: System.out.println("Cuidado com os dentes");
		case 5: System.out.println("Vem ver o que voc� fez");
		case 6: System.out.println("N�o esquece o capacete");
		
		}

	}

}
