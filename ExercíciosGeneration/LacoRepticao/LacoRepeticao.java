package ExercíciosGeneration;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)+
 * 
 */

public class LacoRepeticao {

	public static void main(String[] args) {
		int idade,cont21=0,cont50=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		while(idade!=-99)
		{
			if(idade<22)
				cont21++;	
			if(idade<52) 
				cont50++;
			System.out.println("\nDigite sua idade, para encerrar digite (-99)");
			idade = sc.nextInt();
		}
		
	        System.out.println("O total de pessoas com menos de 21 anos é igual a: "+ cont21);
	        
	        System.out.println("O total de pessoas com mais de 50 anos é igual a: "+ cont50);
	        sc.close();
		
	}

}
