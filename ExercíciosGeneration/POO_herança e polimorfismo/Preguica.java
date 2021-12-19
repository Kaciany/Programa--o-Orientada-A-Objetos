package ExercíciosGeneration;

public class Preguica extends Animal2{

	public Preguica(String nome, int idade,String texto) {
		super(nome, idade,texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void movimento() {
		System.out.println(" Melissa a preguiça se movimenta com lentidão");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Som não indentificado!");
		
		
	}

}
