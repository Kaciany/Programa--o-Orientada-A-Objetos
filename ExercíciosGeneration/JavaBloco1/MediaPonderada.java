package Exerc�ciosGeneration;

/*  Fa�a  um  algoritmo  que  leia  tr�s  notas  de  um  aluno,  calcule  e  escreva  a  m�dia  final  deste  aluno.Considerar que 
a m�dia � ponderada e que o peso das notas � 2, 3 e 5. F�rmula para o c�lculo da m�dia final �:  */

import java.util.Scanner;


public class MediaPonderada {

public static void main(String[] args) {

	
Scanner sc = new Scanner(System.in);
System.out.println("Digite a 1� nota: ");
float nota1 = sc.nextFloat();

System.out.println("Digite a 2� nota: ");
float nota2 = sc.nextFloat();

System.out.println("Digite a 3� nota: ");

float nota3 = sc.nextFloat();


float mediaFinal = (nota1*2 + nota2*3 + nota3*5)/10;

System.out.println("A media final ponderada corresponde �: " + mediaFinal);

		

	}

}