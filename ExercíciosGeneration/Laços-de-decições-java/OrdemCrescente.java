package Exerc�ciosGeneration;

import java.util.Scanner;

/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class OrdemCrescente {

	public static void main(String[] args) {
	 int n1,n2,n3;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite o primeiro numero: ");
	  n1= sc.nextInt();
	  System.out.println("Digite o segundo numero: ");
	  n2= sc.nextInt();
	  System.out.println("Digite o terceiro numero: ");
	  n3= sc.nextInt();
	  
	  if(n2>=n1 && n3>=n1) 
	  {
		  System.out.println("\nA ordem crescente �:"+n1+","+n2+","+n3);
	  }
	  else if(n1>=n2 && n3>=n2)
	  {
		  System.out.println("\nA ordem crescente �:"+n2+","+n3+","+n1);
	  }
	  else if(n1>=n3 && n2>=n3)
	  {
		  System.out.print("\nA ordem crescente �: "+n3+" ," + n2+" ," + n1);
	  }
	  sc.close();
	}

}
