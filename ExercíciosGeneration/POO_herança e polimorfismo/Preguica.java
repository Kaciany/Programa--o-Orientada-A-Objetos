package Exerc�ciosGeneration;

public class Preguica extends Animal2{

	public Preguica(String nome, int idade,String texto) {
		super(nome, idade,texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimento() {
		System.out.println(" Melissa a pregui�a se movimenta com lentid�o");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Som n�o indentificado!");
		
		
	}

}
