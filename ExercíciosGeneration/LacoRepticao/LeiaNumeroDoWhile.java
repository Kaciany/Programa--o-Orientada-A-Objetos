package Exerc�ciosGeneration;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
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
	
	System.out.println("A soma total dos numeros � igual �: "+somanumero);
	
	 sc.close();
	}
	}
