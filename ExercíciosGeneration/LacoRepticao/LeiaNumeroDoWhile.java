package ExercíciosGeneration;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 * 
 */
import java.util.Scanner;

public class LeiaNumeroDoWhile {

	public static void main(String[] args) {
		int numer,somanumero=0;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Digite um numero: ");
		numer = sc.nextInt();
		somanumero+=numer;
		
	}while(numer!=0);
	
	System.out.println("A soma total dos numeros é igual á: "+somanumero);
	
	 sc.close();
	}
	}
