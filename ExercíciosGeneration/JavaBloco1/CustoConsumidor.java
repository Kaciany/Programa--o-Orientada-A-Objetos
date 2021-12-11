package ExercíciosGeneration;
import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do custo de fabrica:  ");
		float custoFabrica= sc.nextFloat();
		
		float custoFinal = custoFabrica +(custoFabrica*28/100) + (custoFabrica*45/100);
        
        System.out.println("O valor do custo do carro corresponde a: "+ custoFinal);
        
        sc.close();
	}

}
