package ExercíciosGeneration;

public abstract class  Animal2 {

	// Atributos de animal
	private String nome;
	private int idade;
	private String texto;
	
	
	// métodos construtores de animal
	
	public Animal2(String nome,int idade,String texto) {
		this.nome=nome;
		this.idade=idade;
		this.texto= texto;
		
		
	}
		abstract public void movimento();
		abstract public void emitirsom();
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
			
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		
}	
		