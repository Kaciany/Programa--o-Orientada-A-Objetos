package projetosDezembro;

import java.util.Scanner;

public class funcionarioTeste {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		
		Funcionario funcionario = new Funcionario("\nJoão","\nOperador de telemarketing","\nVendas",5416556,564643,564643);
		funcionario.imprimirInfo();
		
	}

}
