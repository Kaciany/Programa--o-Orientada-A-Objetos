package ExercíciosGeneration.Arrays;

/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

 */
import java.util.Scanner;

public class Array_ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, somaP = 0, contI = 0, SomaI = 0, contP = 0;
		int[] vetor = new int[6];

		for (i = 0; i < 6; i++) {
			System.out.print("\nEntre com um número: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {

				somaP += vetor[i];

			} else {
				contI++;

			}

		}
		System.out.println("\nA somatória dos números pares é de: " + somaP);

		System.out.println("\nOs números pares digitados foram: ");
		for (i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}

		}
		for (i = 0; i < 6; ++i)

		{
			if (vetor[i] % 2 == 1) {

				SomaI += vetor[i];
			} else {
				contP++;
			}
		}

		System.out.println("\nA somatória dos números impares é de: " + SomaI);

		System.out.println("\nOs números ímpares digitados foram: ");
		for (i = 0; i < 6; i++) {

			if (vetor[i] % 2 == 1) {
				System.out.println(vetor[i]);
				sc.close();
			}
		}
	}

}
