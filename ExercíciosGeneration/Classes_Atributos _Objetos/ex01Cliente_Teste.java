package Exerc�ciosGeneration;

public class ex01Cliente_Teste {

	public static void main(String[] args) {
		// instanciando um objeto da classe cliente
		// "O cliente:" + nomeCliente + " possui o endere�o:" + endereco + " nascido(a)
		// em: " + dataNasc
		// + " sua idade �: " + idade + " rg: " + rg + " cpf:" + cpf);
		eX01Cliente cliente1 = new eX01Cliente(" Kaciany Ramos,", "Rua clemente mares da silva,", 22, 245646554, 24564685,
				17011999);
		cliente1.imprimirInfo();
		
	}

}