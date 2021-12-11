package ExercíciosGeneration;

import java.util.Scanner;

/*1- Faça um programa que receba três numeros inteiros e diga qual deles é o maior.*/

public class LeiaMaior {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEntre com o priemiro numero: ");
		n1 = sc.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		n2= sc.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		n3= sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			
			System.out.println("\nO numero maior é o: "+n1);
			
		}
		else if(n1<n2 && n2>n3) 
		{
			
			System.out.println("\nO numero maior é o: "+n2);
		}
		else {
			System.out.println("\nO numero maior é o: "+n3);
			 sc.close();
		}
	}
		

}
