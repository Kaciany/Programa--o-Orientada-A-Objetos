package PET4U;


import java.util.ArrayList;
import java.util.Scanner;
public class Pessoa1Adocao  extends Pessoa{
	Scanner leia = new Scanner(System.in);

    public Pessoa1Adocao(String nome, String sobrenome, String genero, int idade, String cpf, String telefone,
            String endereco) {
        super(nome, sobrenome, genero, idade, cpf, telefone, endereco);

        {
            ArrayList<String> animais = new ArrayList();
            
           
           

            int x;
            System.out.println("Selecione a opção desejava: ");
            System.out.println("\n 1. Doação.");
            System.out.println("\n 2. Adoção.");
            System.out.println("\n 0. Sair do sistema.");
            x = leia.nextInt();

            switch (x) {

            case 1:

                leia.nextLine();
                System.out.println("\n=== Doação === ");
                System.out.println("\nInforme em sequencia os dados: nome do animal, idade e gênero do animal: ");
                String animal = leia.next();
                animais.add(animal);
                System.out.println("\nParabéns" + nome
                        + ", você acaba de nos passar os dados do seu animal para doar! Para confirmar sua doação entre em contato através do número (11) 4002-8922.");
                break;

            case 2:
                System.out.println("\n=== Adoção === ");
                System.out.println("\nConfira aqui os animais disponíveis para adoção:: ");
                System.out.println("\n" + animais);
                System.out.println("\nParabéns" + nome
                        + ", você acaba de escolher o Pet4U! Para confirmar sua adoção entre em contato através do número (11) 4002-8922.");
                break;

            default:
                System.out.println("Opção inválida.");

            }
            while (x != 0);
                
            }
            
        }
    }






