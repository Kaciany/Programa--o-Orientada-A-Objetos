package Exerc�ciosGeneration.Heran�a;

public class ex01Preguica extends exAnimal {

	private String correr;

	public ex01Preguica(String nome, int idade, String som, String correr) {
		super(nome, idade, som, correr);
		this.correr = correr;
	}

	public void imprimirInfo() {

		System.out.println("\n*****Dados da Pregui�a******\n O nome da pregui�a �: " + getNome() + ", sua idade � "
				+ getIdade() + " anos" + ", emite o seguinte som: " + getSom());
	}

	public void imprimirA��o() {

		System.out.println("\n****** gosta de subir em �rvores !********" + getCorrer());

	}
}
