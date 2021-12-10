package ExercíciosGeneration;

import java.util.Scanner;

/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

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
		  System.out.println("\nA ordem crescente é:"+n1+","+n2+","+n3);
	  }
	  else if(n1>=n2 && n3>=n2)
	  {
		  System.out.println("\nA ordem crescente é:"+n2+","+n3+","+n1);
	  }
	  else if(n1>=n3 && n2>=n3)
	  {
		  System.out.print("\nA ordem crescente é: "+n3+" ," + n2+" ," + n1);
	  }
	  sc.close();
	}

}
