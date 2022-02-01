package ExercíciosGeneration.Herança;

public class ex01Preguica extends exAnimal {

	private String correr;

	public ex01Preguica(String nome, int idade, String som, String correr) {
		super(nome, idade, som, correr);
		this.correr = correr;
	}

	public void imprimirInfo() {

		System.out.println("\n*****Dados da Preguiça******\n O nome da preguiça é: " + getNome() + ", sua idade é "
				+ getIdade() + " anos" + ", emite o seguinte som: " + getSom());
	}

	public void imprimirAção() {

		System.out.println("\n****** gosta de subir em árvores !********" + getCorrer());

	}
}
