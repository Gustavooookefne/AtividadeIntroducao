package org.example.View;

import java.util.Scanner;

public class MenuView {
    Scanner sc = new Scanner(System.in);











    public void exibirMenu(){
        int opcao;

        do{
            System.out.println("--------- Sistema da Biblioteca ---------\n");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Consultar todos os livros cadastrados");
            System.out.println("3 - Registrar Emprestimo de Livro");
            System.out.println("4 - Registrar Devolução de Livro");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:{

                    break;
                }

                case 5:{
                    System.out.println("Saindo do Sistema da Biblioteca...");
                    break;
                }

                default:
                    System.out.println("Opção Invalida. Tente Novamente!");
                    break;
            }

        }while (opcao != 0);
    }
}
