package ExercíciosGeneration;

public class ex01Preguica extends exAnimal {

	private String sexo;

	public ex01Preguica(String nome, int idade, String som, fcorrer, String sexo) {
		super(nome, idade, som, correr);
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void imprimirInfo() {

		System.out.println("\n******Dados do cachorrinho*****\n Nome: " + getNome() + ", sua idade é:" + getIdade()
				+ "emite o seguinte som:" + getSom() + ",pode correr: " + getCorrer() + " km/h");
	}

	public void imprimirSexo(String getSexo) {
		if (sexo == "fêmea") {
			System.out.println("O sexo desse animal é fêmea!");

		} else

			System.out.println("O sexo desse animal é macho!");
	}
}
