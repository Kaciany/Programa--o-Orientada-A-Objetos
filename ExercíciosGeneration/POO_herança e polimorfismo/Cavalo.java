package ExercíciosGeneration;

public class Cavalo extends Animal2 {

	public Cavalo(String nome, int idade,String texto) {
		super(nome, idade,texto);

	}

	@Override
	public void movimento() {
		System.out.println("O cavalo BoJack Horseman gosta de correr!");

	}

	@Override
	public void emitirsom() {

		System.out.println("emite o seguinte som: iiirrrrí, rilinchin");
		
	}

}
