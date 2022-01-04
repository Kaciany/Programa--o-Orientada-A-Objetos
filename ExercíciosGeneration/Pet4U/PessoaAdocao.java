package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaAdocao extends Pessoa {

    Scanner leia = new Scanner(System.in);

    public PessoaAdocao(String nome, String sobrenome, String genero, int idade, String cpf, String telefone,
                        String endereco) {
        super(nome, sobrenome, genero, idade, cpf, telefone, endereco);

        {
            ArrayList<String> animais = new ArrayList();
            animais.add("Cachorro");
            animais.add("Gato");

            boolean mainLoop = true;
            int x;
            while (mainLoop) {
                try {

                    System.out.println("Selecione a opção desejava: ");
                    System.out.println("\n 1. Doação.");
                    System.out.println("\n 2. Adoação.");
                    System.out.println("\n 0. Sair do sistema.");
                    x = leia.nextInt();


                    switch (x) {

                        case 1:

                            leia.nextLine();
                            mainLoop=false;
                            System.out.println("\n=== Doação === ");
                            System.out.println("\nInforme em sequencia os dados: nome do animal, idade e gÃªnero do animal: ");
                            String animal = leia.next();
                            animais.add(animal);
                            System.out.println("\nParabens" + nome
                                    + ", vocÃª acaba de nos passar os dados do seu animal para doar! Para confirmar sua doaÃ§Ã£oo entre em contato atravÃ©s do numero (11) 4002-8922.");
                            break;

                        case 2:
                            mainLoop=false;
                            System.out.println("\n=== Adoação === ");
                            System.out.println("\nConfira aqui os animais disponeveis para adoção:: ");
                            System.out.println("\n" + animais);
                            System.out.println("\nParabens" + nome
                                    + ", vocÃª acaba de escolher o Pet4U! Para confirmar sua adoÃ§Ã£o entre em contato atravÃ©s do numero (11) 4002-8922.");
                            break;

                        default:
                            System.out.println("Opção invalida.");

                    }


                } catch (Exception e) {

                    System.err.println("\nERRO: " + e + "\n");
                    System.out.println("\nDIGITE APENAS Uma das opções");
                    leia.nextLine();
                }


            }
        }
    }
}
