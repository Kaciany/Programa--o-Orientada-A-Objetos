package Exerc�ciosGeneration.Arrays;

/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

 */
import java.util.Scanner;

public class Array_ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, somaP = 0, contI = 0, SomaI = 0, contP = 0;
		int[] vetor = new int[6];

		for (i = 0; i < 6; i++) {
			System.out.print("\nEntre com um n�mero: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {

				somaP += vetor[i];

			} else {
				contI++;

			}

		}
		System.out.println("\nA somat�ria dos n�meros pares � de: " + somaP);

		System.out.println("\nOs n�meros pares digitados foram: ");
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

		System.out.println("\nA somat�ria dos n�meros impares � de: " + SomaI);

		System.out.println("\nOs n�meros �mpares digitados foram: ");
		for (i = 0; i < 6; i++) {

			if (vetor[i] % 2 == 1) {
				System.out.println(vetor[i]);
				sc.close();
			}
		}
	}

}
