package Exerc�ciosGeneration;

public class eX01Cliente {

/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta
 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto
 * e apresente as informa��es deste objeto no console.
 * 
 */
	private String nomeCliente;
	private String endereco;
	private int idade;
	private int rg;
	private int cpf;
	private int dataNasc;

	// m�todo construtor// sempre carreca o nome da classe dentro do metodo
	// constrututor entre
	// parenterses est�o os argumentos, construtores nao retorna nada oq faz isso �
	// a a plavra
	// reservada "new"
	public eX01Cliente(String nomeCliente, String endereco, int idade, int rg, int cpf, int nasc) {
		this.nomeCliente = nomeCliente;
		this.dataNasc = nasc;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;

	}

	public void imprimirInfo() {
		System.out.println("O cliente:" + nomeCliente + " possui o endere�o:" + endereco + " nascido(a) em: " + dataNasc
				+ " sua idade �: " + idade + " rg: " + rg + " cpf:" + cpf);

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}

}
