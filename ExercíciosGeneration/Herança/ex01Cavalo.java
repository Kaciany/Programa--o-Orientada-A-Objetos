package Exerc�ciosGeneration;

public class ex01Cavalo extends exAnimal {

	private String correr;

	public ex01Cavalo(String nome, int idade, String som, String correr) {
		super(nome, idade, som, correr);
		this.correr=correr;
	}
		public void imprimirInfo() {
			
			System.out.println("\n*****Dados do Cavalo******\n O nome do pocot� �: " + getNome() + ", sua idade � "
					+ getIdade()+" anos" + ", emite o seguinte som: " + getSom());
		}
			
			public void imprimirA��o() {
				
				System.out.println("\n****** � usado para hipismo!********"+getCorrer());
		     
				
			}
		}
