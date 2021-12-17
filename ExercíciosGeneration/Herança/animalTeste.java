package ExercíciosGeneration;

public class animalTeste {

	public static void main(String[] args) {

		ex01Cachorro cachorro1 = new ex01Cachorro("Caramelo Santos ", 5, "Au au grrrrr", "");
		ex01Cachorro acao = new ex01Cachorro("\n", 0, "", "");
		ex01Cavalo cavalo = new ex01Cavalo("BoJack Horseman ", 25, "iiirrrrí rilinchin", "");
		ex01Cavalo acao2 = new ex01Cavalo("\n", 0, "", "");
		ex01Preguica preguica = new ex01Preguica("\nMelissa", 12, "shhhhhhhh", "");
		ex01Preguica acao3 = new ex01Preguica("\n", 0, "", "");

		cachorro1.imprimirInfo();
		acao.imprimirAção();
		cavalo.imprimirInfo();
		acao2.imprimirAção();
		preguica.imprimirInfo();
		acao3.imprimirAção();
	}
}
