package ExercíciosGeneration;

public class prodEletronicos {

	private String tipo;
	private String marca;
	private String modelo;
	private String cor;
	private int valor;
	private int garantia;

	public void prodEletronicos(String tipo, String marca, String modelo, String cor, int valor, int garantia) {
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.valor = valor;
		this.garantia = garantia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public void imprimirInfo() {

		System.out.print("\nDigite o produto desejado: ");
		getTipo();

	}

	public void imprimirMarca() {
		System.out.print("\nDigite a  marca desajada: ");
		getMarca();
	}

	public void imprimirModelo() {
		System.out.print("\nDigite o modelo desejado: ");
		getMarca();
	}

	public void imprimirCor() {

		System.out.print("\nDigite a cor do produto: ");
		getCor();

	}

	public void imprimirValor() {
		System.out.println("\nO valor da compra:R$:" + 1500 + getValor());

	}

}
