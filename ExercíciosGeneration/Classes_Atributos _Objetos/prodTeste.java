import java.util.Scanner;

public class prodTeste {

	public static void main(String[] args) {
		String tipo;
		String marca;
		String modelo;
		String cor;
		int valor;
		int garantia=2;
		Scanner sc = new Scanner(System.in);

		prodEletronicos prod1 = new prodEletronicos();
		prod1.imprimirInfo();
		tipo = sc.next();
		prod1.imprimirMarca();
		marca = sc.next();
		prod1.imprimirModelo();
		modelo = sc.next();
		prod1.imprimirCor();
		cor = sc.next();
	
		

		System.out.println("\n*****Dados da compra*******");
		System.out.println("\nProduto escolhido: " + tipo);
		System.out.println("\nMarca: " + marca);
		System.out.println("\nModelo: " + modelo);
		System.out.println("\nCor: " + cor);
		System.out.println("\nGarantia: "+garantia+" anos.");
		prod1.imprimirValor();
		valor = sc.nextInt();
		
		

	}

}
