package exercicios;

import java.time.Year;
import java.util.Scanner;

public class Nascimento {
	
	public static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		int ano = Year.now().getValue();
		
		System.out.print("Digite seu ano de nascimento: ");
		int nasc = entrada.nextInt();
		
		System.out.println("Voc� ja fez anivers�rio esse ano? (S ou N)");
		boolean respValid = false;
		while (!respValid) {
			String resp = entrada.next().toUpperCase();
			
			switch (resp) {
			case "S":
				respValid = true;
				break;
			case "N":
				nasc++;
				respValid = true;
				break;
			default:
				System.out.println("Resposta Inv�lida, digite sua resposta novamente (S ou N)");
			}
		}
		int idade = ano - nasc;
		
		if(idade >= 18) {
			System.out.println("Com " + idade + " anos, voc� � maior de idade!");
	
		}else {
			System.out.println("Com " + idade + " anos, voc� � menor de idade!");
		}
		

	}

}
