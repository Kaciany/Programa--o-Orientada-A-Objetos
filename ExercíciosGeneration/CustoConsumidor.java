package Exerc�ciosGeneration;

/*10)O custo  de  um  carro  novo  ao  consumidor  �  a  soma  do  custo  de  f�brica  com a  porcentagem  do distribuidor e dos impostos 
(aplicados ao custo de f�brica)Supondo que o percentual do distribuidor seja  de  28%  e  os  impostos  de  45%
escrever  um  algoritmo  para  ler o  custo  de  f�brica  de  um  carro, calcular e escrever o custo final ao consumidor. */

import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabrica:  ");
		float custoFabrica= sc.nextFloat();
		
		float custoFinal = custoFabrica +(custoFabrica*28/100) + (custoFabrica*45/100);
        
        System.out.println("O valor do custo do carro corresponde a: "+ custoFinal);
	}

}
