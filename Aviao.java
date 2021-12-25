package ExercíciosGeneration;

/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 * 
 */
public class Aviao {

	private String modelo;
	private String cor;
	private int ano;
	private String compahia;
	private float peso;

	public Aviao(String modelo, String cor, int ano, String compahia, float peso) {

		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.compahia = compahia;
		this.peso = peso;
	}

	public void imprimirInfo() {
		System.out.println( " \n* Modelo: " + getModelo() + "\n* Cor: " + getCor()
				+ " \n* Ano de lançamento: " + getAno() + " \n* Companhia área: "+getCompahia()+" \n* Peso: "+getPeso()+" kg");
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCompahia() {
		return compahia;
	}

	public void setCompahia(String compahia) {
		this.compahia = compahia;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
