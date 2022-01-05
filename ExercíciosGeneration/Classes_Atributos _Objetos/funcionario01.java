package projetosDezembro;

public class Funcionario {
	private String nome;
	private String cargo;
	private String departamento;
	private int telefone;
	private int cpf;
	private int rg;

	
	

	public Funcionario(String nome, String cargo, String departamento, int telefone, int cpf, int rg) {
		// TODO Auto-generated constructor stub
	

	 
		this.nome = nome;
		this.cargo = cargo;
		this.departamento = departamento;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
	}

	

	

	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCargo() {
		return cargo;
	}





	public void setCargo(String cargo) {
		this.cargo = cargo;
	}





	public String getDepartamento() {
		return departamento;
	}





	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}





	public int getTelefone() {
		return telefone;
	}





	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}





	public int getCpf() {
		return cpf;
	}





	public void setCpf(int cpf) {
		this.cpf = cpf;
	}





	public int getRg() {
		return rg;
	}





	public void setRg(int rg) {
		this.rg = rg;
	}





	public void imprimirInfo() {
		System.out.println("\nNome do funcionário: " + getNome() + "\nCargo: " + getCargo() + "\nDepartamento: "
				+ getDepartamento() + "\nTelefone: " + getTelefone() + "\nCpf:" + getCpf() + "\nRg: " + getRg());
	}

}
