package ExercíciosGeneration;

public class TesteAnimal {

	public static void main(String[] args) {
		
		System.out.println("***Dados do Cachorro****");
		Cachorro2 cachorro1= new Cachorro2("Caramelo Santos",15," anos.");
		System.out.println(cachorro1.getNome());
		System.out.print(cachorro1.getIdade());
		System.out.println(cachorro1.getTexto());
        cachorro1.movimento();
        cachorro1.emitirsom();
        
        System.out.println("***Dados do Cavalo****");
		Cavalo cavalo= new Cavalo("BoJack Horseman ",25," anos.");
		System.out.println(cavalo.getNome());
		System.out.print(cavalo.getIdade());
		System.out.println(cavalo.getTexto());
        cavalo.movimento();
        cavalo.emitirsom();
        
        System.out.println("***Dados da preguiça****");
		Preguica preguica= new Preguica("Melissa ",40," anos.");
		System.out.println(preguica.getNome());
		System.out.print(preguica.getIdade());
		System.out.println(preguica.getTexto());
        preguica.movimento();
        preguica.emitirsom();


	}

}
