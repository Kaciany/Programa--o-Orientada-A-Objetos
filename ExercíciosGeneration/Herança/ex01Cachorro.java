package Exerc�ciosGeneration;

public class ex01Cachorro extends exAnimal {

	private String correr;

	public ex01Cachorro(String nome, int idade, String som, String correr) {
		super(nome, idade, som, correr);

		this.correr = correr;

	}

	

	public void imprimirInfo() {
		
		System.out.println("\n*****Dados do Cachorrinho******\n O nome do dog �: " + getNome() + ", sua idade � "
				+ getIdade()+" anos" + ", emite o seguinte som: " + getSom());
	}
		
		public void imprimirA��o() {
			
			System.out.println("\n******gosta de correr!********"+getCorrer());
			
		}
	}

