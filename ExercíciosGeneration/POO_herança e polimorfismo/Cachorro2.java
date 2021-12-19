package ExercíciosGeneration;

public class Cachorro2 extends Animal2 {

	public Cachorro2(String nome, int idade,String texto) {
		super(nome, idade, texto);

	}

	@Override
	public void movimento() {
		System.out.println("O cachorro Caramelo  está correndo!");

	}

	@Override
	public void emitirsom() {
		System.out.println(" emite o seguinte som: Au Au grrrr ");

	}
	
}
