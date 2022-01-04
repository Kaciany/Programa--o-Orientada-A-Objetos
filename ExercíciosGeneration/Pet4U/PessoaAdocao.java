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

                    System.out.println("Selecione a op��o desejava: ");
                    System.out.println("\n 1. Doa��o.");
                    System.out.println("\n 2. Adoa��o.");
                    System.out.println("\n 0. Sair do sistema.");
                    x = leia.nextInt();


                    switch (x) {

                        case 1:

                            leia.nextLine();
                            mainLoop=false;
                            System.out.println("\n=== Doa��o === ");
                            System.out.println("\nInforme em sequencia os dados: nome do animal, idade e gênero do animal: ");
                            String animal = leia.next();
                            animais.add(animal);
                            System.out.println("\nParabens" + nome
                                    + ", você acaba de nos passar os dados do seu animal para doar! Para confirmar sua doaçãoo entre em contato através do numero (11) 4002-8922.");
                            break;

                        case 2:
                            mainLoop=false;
                            System.out.println("\n=== Adoa��o === ");
                            System.out.println("\nConfira aqui os animais disponeveis para ado��o:: ");
                            System.out.println("\n" + animais);
                            System.out.println("\nParabens" + nome
                                    + ", você acaba de escolher o Pet4U! Para confirmar sua adoção entre em contato através do numero (11) 4002-8922.");
                            break;

                        default:
                            System.out.println("Op��o invalida.");

                    }


                } catch (Exception e) {

                    System.err.println("\nERRO: " + e + "\n");
                    System.out.println("\nDIGITE APENAS Uma das op��es");
                    leia.nextLine();
                }


            }
        }
    }
}
