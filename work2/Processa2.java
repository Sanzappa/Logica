import java.util.Scanner;

public class Processa2{

	public static Scanner leia;
	
	public static void main(String[] args){
		leia = new Scanner(System.in);
		//Entrada
		System.out.print("Digite um n�mero inteiro: ");
		int v1 = leia.nextInt();
		//Saida
		System.out.printf("Voc� digitou %d \n",v1);
	}
}	