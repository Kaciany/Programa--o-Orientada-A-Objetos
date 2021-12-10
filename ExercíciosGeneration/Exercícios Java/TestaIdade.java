package ExercíciosGeneration;

import java.util.Scanner;

public class TestaIdade {
	
public static void main(String[] args) {
		
		Scanner  leia = new Scanner(System.in);
		int dia, mes, ano,total_dias;
		
		System.out.println("Digite sua idade em dias: ");
		dia = leia.nextInt();
		System.out.println("Digite sua idade em meses: ");
		mes = leia.nextInt();
		System.out.println("Digite sua idade em anos: ");
		ano = leia.nextInt();
		
		 total_dias= ano*365+mes*30+dia;
		 
		 System.out.printf("Sua idade em dias é: "+ total_dias);
				
	}

	}


