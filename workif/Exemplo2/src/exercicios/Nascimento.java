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
		String resp = entrada.next();
		if(resp = "S"  resp =)
		
		int idade = ano - nasc;
		
		if(idade >= 18) {
			System.out.println("Com " + idade + " anos, voc� � maior de idade!");
	
		}else {
			System.out.println("Com " + idade + " anos, voc� � menor de idade!");
		}
		

	}

}
