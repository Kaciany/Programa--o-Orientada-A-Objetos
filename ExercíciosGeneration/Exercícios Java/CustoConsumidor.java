package ExercíciosGeneration;

/*10)O custo  de  um  carro  novo  ao  consumidor  é  a  soma  do  custo  de  fábrica  com a  porcentagem  do distribuidor e dos impostos 
(aplicados ao custo de fábrica)Supondo que o percentual do distribuidor seja  de  28%  e  os  impostos  de  45%
escrever  um  algoritmo  para  ler o  custo  de  fábrica  de  um  carro, calcular e escrever o custo final ao consumidor. */

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
